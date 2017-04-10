package hu.csega.genetic.framework.collections;

public class BestAndWorstArray {

	private double bestValue = Double.POSITIVE_INFINITY;
	private int bestIndex = -1;

	private double worstValue = Double.NEGATIVE_INFINITY;
	private int worstIndex = 1;

	private int current = 0;
	private int length;
	private Double[] array;

	public BestAndWorstArray(int length) {
		this.length = length;
		this.array = new Double[length];
	}

	public void add(Double d) {
		array[current] = d;

		if(d < bestValue) {
			bestIndex = current;
			bestValue = d;
		}

		if(d > worstValue) {
			worstIndex = current;
			worstValue = d;
		}

		current++;
	}

	public Double first() {
		return array[bestIndex];
	}

	public double getBestValue() {
		return bestValue;
	}

	public void setBestValue(double bestValue) {
		this.bestValue = bestValue;
	}

	public int getBestIndex() {
		return bestIndex;
	}

	public void setBestIndex(int bestIndex) {
		this.bestIndex = bestIndex;
	}

	public double getWorstValue() {
		return worstValue;
	}

	public void setWorstValue(double worstValue) {
		this.worstValue = worstValue;
	}

	public int getWorstIndex() {
		return worstIndex;
	}

	public void setWorstIndex(int worstIndex) {
		this.worstIndex = worstIndex;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Double[] getArray() {
		return array;
	}

	public void setArray(Double[] array) {
		this.array = array;
	}

}
