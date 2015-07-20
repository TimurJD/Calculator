package com.calculator;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author Timur
 * @since 10.07.2015
 */
public class Calculator {

	private JTextField textField;
	private JFrame frame;

	public Calculator() throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, UnsupportedLookAndFeelException {
		initJTextField();
		initFrame();
	}

	private void initJTextField() {
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(6, 6, 220, 35);
	}

	private void initFrame() {
		frame = new JFrame("Calculator");
		frame.getContentPane().setLayout(null);
		frame.setSize(232, 320);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(textField);
		frame.setVisible(true);
	}

	public int doAddition(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	public double doAddition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

	public int doSubtraction(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	public double doSubtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	public int doMultiply(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	public double doMultiply(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

	public double doDivide(double firstNumber, double secondNumber) {
		return firstNumber / secondNumber;
	}

	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException,
			UnsupportedLookAndFeelException {
		new Calculator();
	}
}