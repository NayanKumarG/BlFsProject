package com.bridgelabz.jUnitTestingPrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.util.Utility;

class DecimalToBinaryTest {

	@Test
	void DecimalToBinarytest() {
		assertEquals("111" , Utility.decToBin(7));
	}
	
	@Test
	void DecimalToBinarytest2() {
		assertEquals("10000" , Utility.decToBin(16));
	}

}
