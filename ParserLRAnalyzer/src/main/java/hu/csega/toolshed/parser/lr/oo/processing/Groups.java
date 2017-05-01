package hu.csega.toolshed.parser.lr.oo.processing;

import java.util.ArrayList;

public class Groups extends ArrayList<RuleStateSet> {

	private int lastIdentifier = -1;

	@Override
	public boolean add(RuleStateSet e) {
		lastIdentifier++;
		e.id = lastIdentifier;
		return super.add(e);
	}

	private static final long serialVersionUID = 1L;
}
