package com.bridgelabz.jUnitTestingPrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonthlyPaymentTest {

	@Test
	void testcarLoan() {
		double expected = 1075.851185389782;
		double actual = MonthlyPayment.carLoan(10000 , 50 , 5);
	assertEquals(expected , actual);
	}

}
