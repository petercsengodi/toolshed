package hu.worstofcsega.bfgenerator.bff;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public abstract class BFFCmd {
	
	protected List<BFFCmd> children = new ArrayList<BFFCmd>();
	
	public void add(BFFCmd... nodes) {
		for(BFFCmd node : nodes) {
			children.add(node);
		}
	}
	
	public void generate(BufferedWriter writer) throws Exception {
		recursiveGenerate(writer, -1);
	}
	
	void recursiveGenerate(BufferedWriter writer, int depth) throws Exception {
		String toWrite = generateStart();
		if(toWrite != null) {
			if(toWrite.trim().length() > 0) {
				for(int i = 0; i < depth; i++) {
					writer.write("  ");
				}
			}
			
			writer.write(toWrite);
			writer.write("\n");
		}
		
		for(BFFCmd node : children) {
			node.recursiveGenerate(writer, depth + 1);
		}

		toWrite = generateEnd();
		if(toWrite != null) {
			if(toWrite.trim().length() > 0) {
				for(int i = 0; i < depth; i++) {
					writer.write("  ");
				}
			}

			writer.write(toWrite);
			writer.write("\n");
		}
	}
	
	abstract protected String generateStart();
	abstract protected String generateEnd();
	
	public BFFCmd write(char c) {
		BFFWriteChar wc = new BFFWriteChar();
		wc.c = c;
		this.children.add(wc);
		return this;
	}

	public BFFCmd write(String s) {
		if(s == null || s.length() == 0) {
			return this;
		}
		
		for(int i = 0; i < s.length(); i++) {
			BFFWriteChar wc = new BFFWriteChar();
			wc.c = s.charAt(i);
			this.children.add(wc);
		}
		
		return this;
	}

	public BFFCmd next(int state) {
		BFFNextState ns = new BFFNextState();
		ns.state = state;
		this.children.add(ns);
		return this;
	}
	
	public BFFCmd declareMethod(String methodName, BFFCmd block) {
		BFFDeclareMethod dm = new BFFDeclareMethod();
		dm.methodName = methodName;
		dm.children.add(block);
		BFFProgram.functionNameToState.put(methodName, dm.stateNumber);
		this.children.add(dm);
		return this;
	}
	
	public BFFCmd callMethod(String methodName) {
		BFFCallMethod cm = new BFFCallMethod();
		cm.methodName = methodName;
		this.children.add(cm);
		return this;
	}
	
	public BFFCmd main(BFFCmd block) {
		BFFState state = new BFFState();
		BFFNextState nextState = new BFFNextState();
		nextState.state = state.stateNumber;
		BFFProgram.entryPoint.children.add(nextState);
		state.children.add(block);
		this.children.add(state);
		return this;
	}
}
