package hu.worstofcsega.loser1;

import java.util.HashMap;
import java.util.Map;

public class ActionTable {
	
	public static final String ACCEPT = "A";
	public static final String SHIFT = "S";
	public static final String BREAK = "B";
	public static final String ERROR = "E";

	public static class ActionTableKey {
		public int fromIndex;
		public String terminal;
		
		public ActionTableKey(int fromIndex, String symbol) {
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
		
		
	};
	
	public static class ActionTableValue {
		public String action;
		public Rule rule;

		public ActionTableValue(String action, Rule rule) {
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
	
	public Map<ActionTableKey, ActionTableValue> map = new HashMap<ActionTableKey, ActionTableValue>();

	public void put(int fromIndex, String terminal, String action, Rule rule) {
		map.put(new ActionTableKey(fromIndex, terminal), new ActionTableValue(action, rule));
	}
	
	public ActionTableValue get(int fromIndex, String terminal) {
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
        	
        	if(entry.getKey().terminal.equals(LoseR1Constants.EPSILON)) {
            	builder.append("<e>");
        	} else {
            	builder.append('"');
            	builder.append(entry.getKey().terminal);
            	builder.append('"');
        	}

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
