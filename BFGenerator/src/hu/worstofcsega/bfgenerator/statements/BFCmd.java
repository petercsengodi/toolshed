package hu.worstofcsega.bfgenerator.statements;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public abstract class BFCmd {

	protected List<BFCmd> children = new ArrayList<BFCmd>();
	
	public void add(BFCmd... nodes) {
		for(BFCmd node : nodes) {
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
		
		for(BFCmd node : children) {
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
	
	public BFCmd stateMachine(BFCmd... states) {
		BFStateMachine sm = new BFStateMachine();
		this.children.add(sm);

		for(BFCmd state : states) {
			sm.children.add(state);
		}
		return this;
	}

	public BFCmd write(char c) {
		BFWriteChar wc = new BFWriteChar();
		wc.c = c;
		this.children.add(wc);
		return this;
	}

	public BFCmd next(int state) {
		BFNextState ns = new BFNextState();
		ns.state = state;
		this.children.add(ns);
		return this;
	}
	
}
