package hu.csega.agents.adder;

public interface AdderExecutionEnvironment {

	int getParameter(int i);
	int getRegister(int i);
	void setRegister(int i, int value);
	void setOutput(int i, int value);

}
