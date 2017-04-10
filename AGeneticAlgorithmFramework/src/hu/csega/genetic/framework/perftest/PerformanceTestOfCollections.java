package hu.csega.genetic.framework.perftest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

import hu.csega.genetic.framework.collections.BestAndWorstArray;
import hu.csega.genetic.framework.collections.BubbleBambee;

public class PerformanceTestOfCollections {

	private static final int CYCLES = 10_0/*00*/;
	private static final int ITEMS = 10_000;

	public static void main(String[] args) {

		PerformanceCollectionWrapper[] wrappers = new PerformanceCollectionWrapper[] {

				new PerformanceCollectionWrapper() {
					private TreeSet<Double> imp;

					@Override
					public String type() {
						return "TreeSet";
					}

					@Override
					public void init() {
						imp = new TreeSet<>();
					}

					@Override
					public void add(Double d) {
						imp.add(d);
					}

					@Override
					public Double first() {
						return imp.first();
					}

					@Override
					public Iterator<Double> iterator() {
						return imp.iterator();
					}
				},

				new PerformanceCollectionWrapper() {
					private BestAndWorstArray imp;

					@Override
					public String type() {
						return "BestAndWorstArray";
					}

					@Override
					public void init() {
						imp = new BestAndWorstArray(ITEMS);
					}

					@Override
					public void add(Double d) {
						imp.add(d);
					}

					@Override
					public Double first() {
						return imp.first();
					}

					@Override
					public Iterator<Double> iterator() {
						List<Double> list = new ArrayList<>(Arrays.asList(imp.getArray()));
						Collections.sort(list);
						return list.iterator();
					}
				},

				new PerformanceCollectionWrapper() {
					private BubbleBambee imp;

					@Override
					public String type() {
						return "BubbleBambee";
					}

					@Override
					public void init() {
						imp = new BubbleBambee(ITEMS);
					}

					@Override
					public void add(Double d) {
						imp.add(d);
					}

					@Override
					public Double first() {
						return imp.first();
					}

					@Override
					public Iterator<Double> iterator() {
						List<Double> list = Arrays.asList(imp.getArray());
						return list.iterator();
					}
				}

		};

		for(PerformanceCollectionWrapper wrapper : wrappers) {
			doForImplementation(wrapper);
		}

	}

	public static void doForImplementation(PerformanceCollectionWrapper wrapper) {
		System.out.println("Start: " + wrapper.type());

		long start = System.currentTimeMillis();

		for(int i = 0; i < CYCLES; i++) {
			wrapper.init();

			for(int j = 0; j < ITEMS; j++) {
				Double d = RND.nextDouble();
				wrapper.add(d);
			}

			wrapper.first();

			Double d, last = Double.NEGATIVE_INFINITY;
			Iterator<Double> it = wrapper.iterator();
			while(it.hasNext()) {
				d = it.next();
				if(d == null)
					throw new RuntimeException("Error: " + d + " < " + last);
				if(d < last)
					throw new RuntimeException("Error: " + d + " < " + last);
				last = d;
			}
		}

		long end = System.currentTimeMillis();
		long duration = end - start;
		double durationPerSec = duration / 1000.0;
		double perCycle = duration / (double) CYCLES;

		System.out.println(wrapper.type() + " --- Cycles: " + CYCLES + " Duration: " +
				durationPerSec + " Duration per cycle: " + perCycle + " With items: " + ITEMS);
	}

	private static final Random RND = new Random(System.currentTimeMillis());
}
