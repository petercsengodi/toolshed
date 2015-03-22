package hu.worstofcsega.bfgenerator.bff;


public abstract class BFFHasStateNumber extends BFFCmd {

	int stateNumber = BFFProgram.stateCounter++;
	
}
