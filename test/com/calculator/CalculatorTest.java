package com.calculator;

/**
 * @author Timur Berezhnoi
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void shouldReturnCorrectResult_whenAdditionTwoNumbers() {
		int expected = 7;
		int firstNumber = 3;
		int secondNumber = 4;
		assertEquals(expected, calculator.doAddition(firstNumber, secondNumber));
		
		expected = 35;
		firstNumber = 20;
		secondNumber = 15;
		assertEquals(expected, calculator.doAddition(firstNumber, secondNumber));
	}
}