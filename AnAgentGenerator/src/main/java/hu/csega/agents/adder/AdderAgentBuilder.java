package hu.csega.agents.adder;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.ChromosomeReceiver;

public class AdderAgentBuilder implements ChromosomeReceiver {

	private Object program;

	@Override
	public int sizeInBytes() {
		return 100;
	}

	@Override
	public void fillFromChromosome(Chromosome chromosome) {
		// TODO Auto-generated method stub

	}

	@Override
	public String printableMessage() {
		return convertProgramToScript(program);
	}

	private String convertProgramToScript(Object program) {
		if(program == null)
			return "<< Syntax Error >>";
		return "<< Undefined >>";
	}



}
