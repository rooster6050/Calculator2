package com.qa.calculator2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {
	
	private Multiplier multiplier;

	@Test
	public void test() {
		multiplier = new Multiplier();
		assertEquals(4, multiplier.multiply(2,2));
		assertEquals(9, multiplier.multiply(-3,-3));
		assertEquals(-6, multiplier.multiply(-3,2));
	}

}
