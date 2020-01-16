package com.bridgelabz.jUnitTestingPrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.util.Utility;

class SquareRootTest {

	@Test
	void testsqrtNewton() {
		assertEquals(4 , Utility.sqrtNewton(16));
	}
	
	@Test
	void test2() {
		assertEquals(1, Utility.sqrtNewton(1));
	}

}
