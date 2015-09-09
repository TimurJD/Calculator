package com.calculator.model;

/**
 * @author Timur Berezhnoi tima.peaceworld@gmail.com
 */
public interface Calculable {
	double doAddition(double firstNumber, double secondNumber);
	double doSubtraction(double firstNumber, double secondNumber);
	double doMultiply(double firstNumber, double secondNumber);
	double doDivide(double firstNumber, double secondNumber);
}