package hu.csega.agents.adder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hu.csega.genetic.framework.Chromosome;

public class AdderAgentBuilderTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		Chromosome chromosome = new Chromosome(100);
		// chromosome.randomizeGenes();

		AdderAgentBuilder builder = new AdderAgentBuilder();
		builder.fillFromChromosome(chromosome);
		System.out.println(builder.printableMessage());

		Assert.assertFalse(builder.isError());
	}

	@Test
	public void test2() {
		Chromosome chromosome = new Chromosome(100);
		byte[] bytes = chromosome.getGenes();

		bytes[0] = (byte)1;
		bytes[1] = (byte)10;
		bytes[2] = (byte)11;

		AdderAgentBuilder builder = new AdderAgentBuilder();
		builder.fillFromChromosome(chromosome);
		System.out.println(builder.printableMessage());

		Assert.assertFalse(builder.isError());
	}

	@Test
	public void test3() {
		Chromosome chromosome = new Chromosome(100);
		byte[] bytes = chromosome.getGenes();

		bytes[0] = (byte)40;
		bytes[1] = (byte)1;
		bytes[2] = (byte)10;
		bytes[3] = (byte)1;
		bytes[4] = (byte)11;
		bytes[5] = (byte)12;

		AdderAgentBuilder builder = new AdderAgentBuilder();
		builder.fillFromChromosome(chromosome);
		System.out.println(builder.printableMessage());

		Assert.assertFalse(builder.isError());
	}

}
