package com.bridgelabz.jUnitTestingPrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VendingMachineTest {

	VendingMachine vm = new VendingMachine();
	int a[] = {1,2,5,10,50,100,500,1000};
	@Test
	public void testcheckLarge() {
		int actual = vm.checkLarge(a , 1000);
		int expected = 1000;
		assertEquals(expected , actual);
	
	}
	
	@Test
	public void test2()
	{
		assertEquals(1000 , vm.checkLarge(a , 1500));
	}
	
	@Test
	public void test3()
	{
		assertEquals(10, vm.checkLarge(a , 10));
	}
}
