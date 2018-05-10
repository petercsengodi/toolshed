package hu.csega.ficbidta.model;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import hu.csega.ficbidta.model.operations.ModelOperation;

public class ModelStepStack {
	
	public Stack<ModelStep> doneStack = new Stack<ModelStep>();
	public Stack<ModelStep> todoStack = new Stack<ModelStep>();
	
	public void doOperation(ModelOperation... operations) {
		doOperations(Arrays.asList(operations));
	}
	
	public void doOperations(List<ModelOperation> operations) {
		todoStack.clear();
		ModelStep step = new ModelStep();
		step.operations = operations;
		step.doOperations();
		doneStack.push(step);
	}
	
	public void undoOneStep() {
		if(!doneStack.empty()) {
			ModelStep step = doneStack.pop();
			step.undoOperations();
			todoStack.push(step);
		}
	}
	
	public void redoOneStep() {
		if(!todoStack.empty()) {
			ModelStep step = todoStack.pop();
			step.doOperations();
			doneStack.push(step);
		}
	}
	
	public void clear() {
		doneStack.clear();
		todoStack.clear();
	}
}
