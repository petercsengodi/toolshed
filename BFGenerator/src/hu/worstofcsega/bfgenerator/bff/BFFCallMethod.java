package hu.worstofcsega.bfgenerator.bff;

public class BFFCallMethod extends BFFState {
	
	String methodName;
	
	@Override
	protected String generateStart() {
		// push to call stack
		String push = (new String(new char[this.stateNumber]).replace("\0", "+"));

		int newState = BFFProgram.functionNameToState.get(methodName);
		
		return BFFProgram.comment("call method: " + methodName) + 
				BFFNextState.generateNextState(newState) +
				BFFProgram.comment("set next state to method to call: " + newState) + 
				push + BFFProgram.comment("push state " + this.stateNumber + " to call stack") +
				super.generateEnd();
	}

	@Override
	protected String generateEnd() {
		return super.generateStart();
	}

}
