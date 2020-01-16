package com.bridgelabz.jUnitTestingPrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.util.Utility;

class TemperatureConversionTest {

	@Test
	void testcelToFar() {
		assertEquals(176.0 , Utility.celToFar(80));
	}
	
	@Test
	void test2() {
		assertEquals(80.0 , Utility.farToCel(176.0));
	}

}
