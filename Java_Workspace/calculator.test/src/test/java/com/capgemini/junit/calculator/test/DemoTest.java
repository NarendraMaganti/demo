package com.capgemini.junit.calculator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	@DisplayName("To test add method of calculator")
	void addTest() {
		Calculator cal = new Calculator();
		int i = cal.add(10, 5);
		assertEquals(15, i);
	}

	@Test
	@DisplayName("to test add method for negative values")
	void addNegativeTest() {
		Calculator cal = new Calculator();
		int i = cal.add(-20, 30);
		assertEquals(10,i);
	}


}
