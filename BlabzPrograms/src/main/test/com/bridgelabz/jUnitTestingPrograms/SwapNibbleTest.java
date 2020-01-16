package com.bridgelabz.jUnitTestingPrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwapNibbleTest {

	@Test
	void testcheckPowerOfTwo() {
		assertTrue(SwapNibble.checkPowerOfTwo(32));
	}
	
	@Test
	void test2() {
		assertFalse(SwapNibble.checkPowerOfTwo(70));
	}
	
	@Test
	void test3() {
		assertEquals(false , SwapNibble.checkPowerOfTwo(55));
	}
	
	

	
	@Test
	 void testswapNibble() {
		assertEquals("01000110" , SwapNibble.swapNibble("1100100"));
	}

}
