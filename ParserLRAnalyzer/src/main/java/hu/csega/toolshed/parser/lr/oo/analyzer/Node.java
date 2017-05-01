package hu.csega.toolshed.parser.lr.oo.analyzer;

import java.util.ArrayList;
import java.util.List;

import hu.csega.toolshed.parser.lr.oo.formulas.Atom;
import hu.csega.toolshed.parser.lr.oo.formulas.Formula;

public class Node {

	Atom atom;
	Formula formula;
	List<Node> children = new ArrayList<Node>();
	Object data;
	String title;

	public Atom getAtom() {
		return atom;
	}

	public void setAtom(Atom atom) {
		this.atom = atom;
	}

	public Formula getFormula() {
		return formula;
	}

	public void setFormula(Formula formula) {
		this.formula = formula;
	}

	public List<Node> getChildren() {
		return children;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		if (title == null) {

			if (data == null) {
				return atom.toString();
			} else {
				return atom + "[" + data + "]";
			}
		}

		return atom + "[" + title + "]";
	}
}
