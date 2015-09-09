package com.calculator.model;

/**
 * @author Timur Berezhnoi tima.peaceworld@gmail.com
 */
public class MathOperator implements Calculable {
	
	@Override
	public double doAddition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

	@Override
	public double doSubtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	@Override
	public double doMultiply(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

	@Override
	public double doDivide(double firstNumber, double secondNumber) {
		return firstNumber / secondNumber;
	}
}