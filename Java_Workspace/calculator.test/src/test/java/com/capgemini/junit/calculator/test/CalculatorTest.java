package com.capgemini.junit.calculator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator c;
	
	@BeforeAll
	static void runBeforeAll() {
		System.out.println("run Before all");
	}
	@BeforeEach
	void createCalObject() {
		System.out.println("I am before each");
		c = new Calculator();
	}
	@AfterEach
	void destroyCalObject() {
		System.out.println("I am after each");
	}
	@AfterAll
	static void runAfterAll() {
		System.out.println("I am after all");
	}
	@Test
	void add() {
		int i = c.add(20, 30);
		assertEquals(50,i);
	}
	@Test
	void nadd() {
		int i = c.add(-20, 30);
		assertEquals(10,i);
	}


}
