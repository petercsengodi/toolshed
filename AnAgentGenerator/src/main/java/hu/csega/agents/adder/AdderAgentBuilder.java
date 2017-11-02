package hu.csega.agents.adder;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import hu.csega.agents.adder.operations.AdderNodeOperation;
import hu.csega.agents.adder.operations.AdderOperation;
import hu.csega.agents.adder.operations.AdderReadParam;
import hu.csega.agents.adder.operations.AdderReadRegister;
import hu.csega.agents.adder.operations.AdderSimpleOperation;
import hu.csega.agents.adder.operations.AdderWriteOutput;
import hu.csega.agents.adder.operations.AdderWriteRegister;
import hu.csega.common.BytePipeline;
import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.ChromosomeReceiver;

public class AdderAgentBuilder implements ChromosomeReceiver, AdderExecutionEnvironment, Serializable {

	private boolean error;

	// Registers
	int[] parameters = new int[10];
	int[] output = new int[10];
	int[] registers = new int[10];

	// Building the AST
	private transient Stack<AdderNodeOperation> parents;
	private transient List<AdderOperation> programs;

	public boolean isError() {
		return error;
	}

	@Override
	public int sizeInBytes() {
		return 10;
	}

	@Override
	public void fillFromChromosome(Chromosome chromosome) {
		parents = new Stack<>();
		programs = new ArrayList<>();

		byte[] byteCode = chromosome.getGenes();
		parseByteCode(byteCode);
	}

	@Override
	public String printableMessage() {
		return convertProgramToScript(programs);
	}

	private String convertProgramToScript(List<AdderOperation> programs) {
		if(error || programs == null || programs.isEmpty())
			return "<< Syntax Error >>";

		StringBuilder builder = new StringBuilder();

		boolean first = true;

		for(AdderOperation program : programs) {
			if(first)
				first = false;
			else
				builder.append('\n');
			program.generateScript(builder);
		}

		return builder.toString();
	}

	public void setParameters(int... values) {
		int counter = 0;
		for(int v : values) {
			parameters[counter] = v;
			registers[counter] = 0;
			output[counter] = 0;
			counter++;
		}

		for(; counter < 10; counter++) {
			parameters[counter] = 0;
			registers[counter] = 0;
			output[counter] = 0;
		}
	}

	private AdderOperation parseByteCode(byte[] byteCode) {
		AdderOperation currentOperation = null;
		error = true;

		BytePipeline bp = new BytePipeline(byteCode);
		while(bp.hasNext()) {
			int code = bp.next();

			switch(code) {
			case 0:
				currentOperation = new AdderSimpleOperation(this, (char)0);
				break;
			case 1:
				currentOperation = new AdderSimpleOperation(this, '+');
				break;
			case 2:
				currentOperation = new AdderSimpleOperation(this, '-');
				break;
			case 3:
				currentOperation = new AdderSimpleOperation(this, '*');
				break;
			case 4:
				currentOperation = new AdderSimpleOperation(this, '/');
				break;
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
				currentOperation = new AdderReadParam(this, code - 10);
				break;
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
				currentOperation = new AdderReadRegister(this, code - 20);
				break;
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
			case 36:
			case 37:
			case 38:
			case 39:
				currentOperation = new AdderWriteRegister(this, code - 30);
				break;
			case 40:
			case 41:
			case 42:
			case 43:
			case 44:
			case 45:
			case 46:
			case 47:
			case 48:
			case 49:
				currentOperation = new AdderWriteOutput(this, code - 40);
				break;
			default:
				// error case
				error = true;
				return null;
			}

			if(currentOperation.numberOfCurrentChildren() < currentOperation.numberOfNeededChildren()) {
				parents.push((AdderNodeOperation)currentOperation);
			}

			while(!parents.isEmpty() && currentOperation != null && currentOperation.numberOfCurrentChildren() == currentOperation.numberOfNeededChildren()) {
				AdderNodeOperation peek = parents.peek();
				peek.getChildren().add(currentOperation);
				currentOperation = null;

				if(peek.numberOfCurrentChildren() == peek.numberOfNeededChildren())
					currentOperation = parents.pop();
			}

			if(parents.isEmpty() && currentOperation != null) {
				programs.add(currentOperation);
				if(currentOperation instanceof AdderSimpleOperation) {
					AdderSimpleOperation op = (AdderSimpleOperation) currentOperation;
					if(op.isReturnStatement()) {
						error = false;
						return currentOperation;
					}
				}
			}
		}

		if(!parents.isEmpty()) {
			error = true;
			return null;
		}

		error = false;
		return currentOperation;
	}

	public int[] getOutput() {
		return output;
	}

	public void execute() {
		if(error) {
			for(int i = 0; i < output.length; i++)
				output[i] = Integer.MAX_VALUE;
			return;
		}

		for(AdderOperation program : programs)
			program.execute();
	}

	@Override
	public int getParameter(int i) {
		return parameters[i];
	}

	@Override
	public int getRegister(int i) {
		return registers[i];
	}

	@Override
	public void setRegister(int i, int value) {
		registers[i] = value;
	}

	@Override
	public void setOutput(int i, int value) {
		output[i] = value;
	}

	private static final long serialVersionUID = 1L;
}
