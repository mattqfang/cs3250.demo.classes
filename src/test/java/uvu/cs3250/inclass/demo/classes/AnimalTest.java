package uvu.cs3250.inclass.demo.classes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AnimalTest {
	private Animal anAnimal;
	
	@Before
	public void setUp() {
		anAnimal = new Animal();
	}
	
	@Test
	public void testMove() {
		assertEquals("I am moving!", anAnimal.move());
	}
	
	@Test
	public void testCrawl() {
		assertEquals("I am crawling...", anAnimal.crawl());
	}
}
