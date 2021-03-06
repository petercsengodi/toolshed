package hu.csega.toolshed.parser.lr.impl;

import java.util.HashMap;
import java.util.Map;

public class JumpTable {

	public static class JumpTableKey {
		public int fromIndex;
		public String symbol;
		
		public JumpTableKey(int fromIndex, String symbol) {
			this.fromIndex = fromIndex;
			this.symbol = symbol;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + fromIndex;
			result = prime * result
					+ ((symbol == null) ? 0 : symbol.hashCode());
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
			JumpTableKey other = (JumpTableKey) obj;
			if (fromIndex != other.fromIndex)
				return false;
			if (symbol == null) {
				if (other.symbol != null)
					return false;
			} else if (!symbol.equals(other.symbol))
				return false;
			return true;
		}
		
		
	};
	
	public static class JumpTableValue {
		public int toIndex;

		public JumpTableValue(int toIndex) {
			this.toIndex = toIndex;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + toIndex;
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
			JumpTableValue other = (JumpTableValue) obj;
			if (toIndex != other.toIndex)
				return false;
			return true;
		}
		
		
	}
	
	public Map<JumpTableKey, JumpTableValue> map = new HashMap<JumpTableKey, JumpTableValue>();

	public void put(int fromIndex, String symbol, int toIndex) {
		map.put(new JumpTableKey(fromIndex, symbol), new JumpTableValue(toIndex));
	}
	
	public int get(int fromIndex, String symbol) {
		JumpTableValue v = map.get(new JumpTableKey(fromIndex, symbol));
		return (v != null ? v.toIndex : -1);
	}
	
	@Override
    public String toString() {
		StringBuilder builder = new StringBuilder();
    	builder.append("Jump table: \n");
        for(Map.Entry<JumpTableKey, JumpTableValue> entry : map.entrySet()) {
        	builder.append("[");
        	builder.append(entry.getKey().fromIndex);
        	builder.append("] + ");
        	builder.append(entry.getKey().symbol);
        	builder.append(" => ["); 
        	builder.append(entry.getValue().toIndex);
        	builder.append("]\n");
        }
        
        return builder.toString();
    }

}
