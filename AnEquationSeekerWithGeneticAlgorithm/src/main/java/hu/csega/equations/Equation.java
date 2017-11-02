package hu.csega.equations;

import hu.csega.equations.util.Conversions;
import hu.csega.equations.util.Executable;
import hu.csega.equations.util.Operation;
import hu.csega.equations.util.OperationWrapper;
import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.ChromosomeReceiver;

public class Equation implements ChromosomeReceiver {

	public Executable root;

	@Override
	public int sizeInBytes() {
		return 0; // unknown
	}

	@Override
	public String printableMessage() {
		return toString();
	}

	@Override
	public String toString() {
		return root.toString();
	}

	@Override
	public void fillFromChromosome(Chromosome chromosome) {
		byte[] genes = chromosome.getGenes();
		root = build(genes, 0, genes.length - 1);
	}

	public double calculate(double[] variables) {
		return root.execute(variables);
	}

	private Executable build(byte[] bytes, int startIndex, int endIndex) {
		int len = endIndex - startIndex + 1;
		if(len == 2) {
			return Conversions.variableWithScalarFromBytes(bytes[startIndex], bytes[endIndex]);
		} else if (len > 2) {
			if(len % 2 == 0)
				throw new RuntimeException("Error building tree!");
			int s = startIndex, e = endIndex;

			while(s < e) {
				s++;
				e--;
			}

			if(s != e)
				throw new RuntimeException("Error building tree!");

			Operation op = Conversions.operationFromByte(bytes[s]);
			OperationWrapper wrapper = new OperationWrapper();
			wrapper.operation = op;
			wrapper.left = build(bytes, startIndex, s - 1);
			wrapper.right = build(bytes, e + 1, endIndex);
			return wrapper;
		} else {
			throw new RuntimeException("Error building tree!");
		}
	}
}
