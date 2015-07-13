package com.calculator;

/**
 * @author Timur Berezhnoi
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	public void shouldCreateCalculator() {
		assertNotNull(calculator);
	}

	@Test
	public void shouldReturnCorrectResult_whenAdditionTwoIntegers() {
		int expected = 7;
		int firstNumber = 3;
		int secondNumber = 4;
		assertEquals(expected, calculator.doAddition(firstNumber, secondNumber));
	}
	
	@Test
	public void shouldReturnCorrectResult_whenAdditionTwoDoubles() {
		double expected = 10.5;
		double firstNumber = 5;
		double secondNumber = 5.5;
		assertEquals(expected, calculator.doAddition(firstNumber, secondNumber), 0);
	}
	
	@Test
	public void shouldReturnCorrectResult_whenSubtratctionTwoIntegers() {
		int expected = 7;
		int firstNumber = 11;
		int secondNumber = 4;
		assertEquals(expected, calculator.doSubtraction(firstNumber, secondNumber));
	}
	
	@Test
	public void shouldReturnCorrectResult_whenSubtractionTwoDoubles() {
		double expected = 74.3;
		double firstNumber = 78.3;
		double secondNumber = 4;
		assertEquals(expected, calculator.doSubtraction(firstNumber, secondNumber), 0);
	}
	
	@Test
	public void shouldReturnCorrectResult_whenAdditionTwoNagativeIntegers() {
		int expected = -5;
		int firstNumber = -1;
		int secondNumber = -4;
		assertEquals(expected, calculator.doAddition(firstNumber, secondNumber));
	}
	
	@Test
	public void shouldReturnCorrectResult_whenAdditionTwoNagativeDoubles() {
		double expected = -5.9;
		double firstNumber = -1.9;
		double secondNumber = -4;
		assertEquals(expected, calculator.doAddition(firstNumber, secondNumber), 0);
	}
	
	@Test
	public void shouldReturnCorrectResult_whenSubtractionTwoNagativeIntegers() {
		int expected = -66;
		int firstNumber = -102;
		int secondNumber = -36;
		assertEquals(expected, calculator.doSubtraction(firstNumber, secondNumber));
	}
	
	@Test
	public void shouldReturnCorrectResult_whenSubtractionTwoNagativeDoubles() {
		double expected = -156.527;
		double firstNumber = -192.867;
		double secondNumber = -36.34;
		assertEquals(expected, calculator.doSubtraction(firstNumber, secondNumber), 0);
	}
}