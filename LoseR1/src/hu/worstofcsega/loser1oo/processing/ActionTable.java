package hu.worstofcsega.loser1oo.processing;

import hu.worstofcsega.loser1oo.formulas.Atom;
import hu.worstofcsega.loser1oo.formulas.Formula;

import java.util.Map;
import java.util.TreeMap;

public class ActionTable {
	
	public static final String ACCEPT = "A";
	public static final String SHIFT = "S";
	public static final String BREAK = "B";
	public static final String ERROR = "E";

	public static class ActionTableKey implements Comparable<ActionTableKey> {
		public int fromIndex;
		public Atom terminal;
		
		public ActionTableKey(int fromIndex, Atom symbol) {
			this.fromIndex = fromIndex;
			this.terminal = symbol;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + fromIndex;
			result = prime * result
					+ ((terminal == null) ? 0 : terminal.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ActionTableKey other = (ActionTableKey) obj;
			if (fromIndex != other.fromIndex)
				return false;
			if (terminal == null) {
				if (other.terminal != null)
					return false;
			} else if (!terminal.equals(other.terminal))
				return false;
			return true;
		}

		@Override
		public int compareTo(ActionTableKey o) {
			int c = this.fromIndex - o.fromIndex;
			if(c != 0) {
				return c;
			}
			
			return this.terminal.compareTo(o.terminal);
		}
		
		
	};
	
	public static class ActionTableValue {
		public String action;
		public Formula rule;

		public ActionTableValue(String action, Formula rule) {
			this.action = action;
			this.rule = rule;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((action == null) ? 0 : action.hashCode());
			result = prime * result + ((rule == null) ? 0 : rule.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ActionTableValue other = (ActionTableValue) obj;
			if (action == null) {
				if (other.action != null)
					return false;
			} else if (!action.equals(other.action))
				return false;
			if (rule == null) {
				if (other.rule != null)
					return false;
			} else if (!rule.equals(other.rule))
				return false;
			return true;
		}

				
	}
	
	public Map<ActionTableKey, ActionTableValue> map = new TreeMap<ActionTableKey, ActionTableValue>();

	public void put(int fromIndex, Atom terminal, String action, Formula rule) {
		map.put(new ActionTableKey(fromIndex, terminal), new ActionTableValue(action, rule));
	}
	
	public ActionTableValue get(int fromIndex, Atom terminal) {
		ActionTableValue v = map.get(new ActionTableKey(fromIndex, terminal));
		if(v == null) {
			v = new ActionTableValue(ERROR, null);
		}
		
		return v;
	}
	
	@Override
    public String toString() {
		StringBuilder builder = new StringBuilder();
    	builder.append("Action table: \n");
        for(Map.Entry<ActionTableKey, ActionTableValue> entry : map.entrySet()) {
        	builder.append("[");
        	builder.append(entry.getKey().fromIndex);
        	builder.append("] + ");
           	builder.append(entry.getKey().terminal);
        	builder.append(" => "); 
        	builder.append(entry.getValue().action);
        	
        	if(entry.getValue().action.equals(BREAK)) {
	        	builder.append(" | "); 
	        	builder.append(entry.getValue().rule);
        	}
        	
        	builder.append("\n");
        }
        
        return builder.toString();
    }

}
