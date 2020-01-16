package com.bridgelabz.jUnitTestingPrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DayOfWeekTest {

	@Test
	void dayOfWeektest() {
		assertEquals("Friday" , DayOfWeek.dayOfWeek(26 , 9 , 1997));
		
	}

}
