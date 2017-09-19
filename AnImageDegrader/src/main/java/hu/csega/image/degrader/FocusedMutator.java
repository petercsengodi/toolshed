package hu.csega.image.degrader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.Population;
import hu.csega.genetic.framework.mutation.MutationExecutionStrategy;
import hu.csega.image.common.BitAssembler;
import hu.csega.image.common.BitPipeline;
import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;

public class FocusedMutator implements MutationExecutionStrategy {

	private BitPipeline bp = new BitPipeline();
	private BitAssembler ba = new BitAssembler();

	@Override
	public List<Chromosome> mutate(Population population, Chromosome chromosome) {
		List<Chromosome> ret = new ArrayList<>();

		int len = chromosome.getGenes().length;
		int numberOfSteps = len*2;

		Map<String, String> ep = population.getExtraProperties();
		String leftOffProperty = ep.get("leftOff");
		int leftOff = 0;

		try {
			if(leftOffProperty != null)
				leftOff = Integer.parseInt(leftOffProperty);
		} catch(Exception ex) {
			logger.warning("Couldn't parse leftOff value: " + leftOffProperty);
			leftOff = 0;
		}

		int step = leftOff;
		if(step > numberOfSteps) {
			step = step % numberOfSteps;
		}

		int position = step / 2;
		int part = step % 2;
		int tmp;

		for(int i = 0; i < 15; i++) {
			Chromosome copy = population.copyChromosome(chromosome);
			ret.add(copy);

			byte[] array = copy.getGenes();
			bp.set(array[position]);
			ba.setByteArray(array);
			ba.setPosition(position);

			if(part == 0){
				tmp = bp.readBits(4); // throw away
				tmp = bp.readBits(4);
				ba.setBitsAndSlide(i, 4);
				ba.setBitsAndSlide(tmp, 4);
			} else {
				tmp = bp.readBits(4);
				ba.setBitsAndSlide(tmp, 4);
				ba.setBitsAndSlide(i, 4);
			}
		}

		step++;
		int percentage = (int)(step * 100.0 / numberOfSteps);

		ep.put("leftOff", String.valueOf(step));
		ep.put("percentage", String.valueOf(percentage));
		return ret;
	}

	private static final Logger logger = LoggerFactory.createLogger(FocusedMutator.class);
}
