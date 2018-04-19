package com.qa.calculator2;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivideTest {
	
	private Divider divider;

	@Test
	public void test() {
		divider = new Divider();
		assertEquals(3,divider.divide(9,3));
		assertEquals(-3,divider.divide(-9,3));
		assertEquals(0,divider.divide(9,0));
	}

}
