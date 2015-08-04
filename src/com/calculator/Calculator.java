package com.calculator;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author Timur
 * @since 10.07.2015
 */
public class Calculator {

	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;

	private JTextField textField;
	private JPanel mainPanel;
	private JFrame frame;
	private JButton buttonDot;
	private JButton buttonClear;
	private JButton buttonEqual;
	private JButton buttonPlus;
	private JButton buttonMinus;
	private JButton buttonMultiply;
	private JButton buttonDivide;

	public Calculator() throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, UnsupportedLookAndFeelException {
		initPanel();
		initJTextField();
		createButtons();
		initFrame();
	}

	private void initPanel() {
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(139, 69, 19));
		mainPanel.setLayout(new GridBagLayout());
	}

	private void initJTextField() {
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		addComponent(mainPanel, textField, 0, 0, 6, 1, new Insets(7, 5, 5, 5),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);
	}

	private void createButtons() {

		button0 = new JButton("0");
		addComponent(mainPanel, button0, 0, 5, 2, 1, new Insets(0, 5, 5, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		button0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});

		button1 = new JButton("1");
		addComponent(mainPanel, button1, 0, 4, 1, 1, new Insets(0, 5, 0, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});

		button2 = new JButton("2");
		addComponent(mainPanel, button2, 1, 4, 1, 1, new Insets(0, 0, 0, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});

		button3 = new JButton("3");
		addComponent(mainPanel, button3, 2, 4, 1, 1, new Insets(0, 0, 0, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});

		button4 = new JButton("4");
		addComponent(mainPanel, button4, 0, 3, 1, 1, new Insets(0, 5, 0, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});

		button5 = new JButton("5");
		addComponent(mainPanel, button5, 1, 3, 1, 1, new Insets(0, 0, 0, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});

		button6 = new JButton("6");
		addComponent(mainPanel, button6, 2, 3, 1, 1, new Insets(0, 0, 0, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		button6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});

		button7 = new JButton("7");
		addComponent(mainPanel, button7, 0, 2, 1, 1, new Insets(0, 5, 0, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});

		button8 = new JButton("8");
		addComponent(mainPanel, button8, 1, 2, 1, 1, new Insets(0, 0, 0, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		button8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});

		button9 = new JButton("9");
		addComponent(mainPanel, button9, 2, 2, 1, 1, new Insets(0, 0, 0, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		button9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});

		buttonDot = new JButton(".");
		addComponent(mainPanel, buttonDot, 2, 5, 1, 1, new Insets(0, 0, 5, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		buttonDot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		
		buttonClear = new JButton("С");
		addComponent(mainPanel, buttonClear, 0, 1, 2, 1,
				new Insets(0, 5, 5, 0), GridBagConstraints.CENTER,
				GridBagConstraints.BOTH);
		buttonClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});

		buttonEqual = new JButton("=");
		addComponent(mainPanel, buttonEqual, 3, 4, 1, 2,
				new Insets(0, 3, 5, 5), GridBagConstraints.CENTER,
				GridBagConstraints.BOTH);
		buttonEqual.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		buttonPlus = new JButton("+");
		addComponent(mainPanel, buttonPlus, 3, 3, 1, 1, new Insets(0, 3, 0, 5),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		buttonPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		buttonMinus = new JButton("-");
		addComponent(mainPanel, buttonMinus, 3, 2, 1, 1,
				new Insets(0, 3, 0, 5), GridBagConstraints.CENTER,
				GridBagConstraints.BOTH);
		buttonMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		buttonMultiply = new JButton("*");
		addComponent(mainPanel, buttonMultiply, 3, 1, 1, 1, new Insets(0, 3, 0,
				5), GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		buttonMultiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		buttonDivide = new JButton("/");
		addComponent(mainPanel, buttonDivide, 2, 1, 1, 1,
				new Insets(0, 3, 3, 0), GridBagConstraints.CENTER,
				GridBagConstraints.BOTH);
		buttonDivide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
	}

	private void initFrame() {
		frame = new JFrame("Calculator");
		frame.setContentPane(mainPanel);
		frame.setSize(232, 320);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private void addComponent(Container container, Component component,
			int gridx, int gridy, int gridwidth, int gridheight, Insets insets,
			int anchor, int fill) {
		container.add(component, new GridBagConstraints(gridx, gridy,
				gridwidth, gridheight, 1.0, 1.0, anchor, fill, insets, 0, 0));
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