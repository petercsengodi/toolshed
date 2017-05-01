package hu.csega.toolshed.loser1;

import java.util.ArrayList;

public class Groups extends ArrayList<RuleStateSet> {

	/**
	 * Default serial version uid.
	 */
	private static final long serialVersionUID = 1L;

	private int lastIdentifier = -1;

	@Override
	public boolean add(RuleStateSet e) {
		lastIdentifier++;
		e.id = lastIdentifier;
		return super.add(e);
	}

}
