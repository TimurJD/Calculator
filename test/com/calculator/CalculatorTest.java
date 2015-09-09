package com.calculator;

/**
 * @author Timur Berezhnoi
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.calculator.model.Calculable;
import com.calculator.model.MathOperator;

public class CalculatorTest {

	private Calculable calculator;
	
	@Before
	public void setUp() {
		calculator = new MathOperator();
	}
	
	@Test
	public void shouldCreateCalculator() {
		assertNotNull(calculator);
	}
	
	@Test
	public void shouldReturnCorrectResult_whenAdditionTwoDoubles() {
		double expected = 10.5;
		double firstNumber = 5;
		double secondNumber = 5.5;
		assertEquals(expected, calculator.doAddition(firstNumber, secondNumber), 0);
	}
	
	@Test
	public void shouldReturnCorrectResult_whenSubtractionTwoDoubles() {
		double expected = 74.3;
		double firstNumber = 78.3;
		double secondNumber = 4;
		assertEquals(expected, calculator.doSubtraction(firstNumber, secondNumber), 0);
	}
		
	@Test
	public void shouldReturnCorrectResult_whenAdditionTwoNagativeDoubles() {
		double expected = -5.9;
		double firstNumber = -1.9;
		double secondNumber = -4;
		assertEquals(expected, calculator.doAddition(firstNumber, secondNumber), 0);
	}
	
	@Test
	public void shouldReturnCorrectResult_whenSubtractionTwoNagativeDoubles() {
		double expected = -156.527;
		double firstNumber = -192.867;
		double secondNumber = -36.34;
		assertEquals(expected, calculator.doSubtraction(firstNumber, secondNumber), 0);
	}
	
	@Test
	public void shouldReturnCorrectResult_whenMultiplyTwoDoubles() {
		double expected = 125.08;
		double firstNumber = 23.6;
		double secondNumber = 5.3;
		assertEquals(expected, calculator.doMultiply(firstNumber, secondNumber), 0);
	}
	
	@Test
	public void shouldReturnCorrectResult_whenDivideTwoNumbers() {
		double expected = 5;
		double firstNumber = 15;
		double secondNumber = 3;
		assertEquals(expected, calculator.doDivide(firstNumber, secondNumber), 0);
	}
	
	@Test
	public void shouldReturnCorrectResult_whenDivide_whenFirstIntegerLessThanSecond() {
		double expected = 0.1;
		int firstNumber = 10;
		int secondNumber = 100;
		assertEquals(expected, calculator.doDivide(firstNumber, secondNumber), 0.1);
	}
}