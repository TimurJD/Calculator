package com.calculator.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * @author Timur Berezhnoi tima.peaceworld@gmail.com
 */
public class CalculatorView {

	private JButton[] buttons;

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

	public CalculatorView() {
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
		 buttons = new JButton[] {new JButton("0"), new JButton("1"), new JButton("2"),
							new JButton("3"), new JButton("4"), new JButton("5"), new JButton("6"),
							new JButton("7"), new JButton("8"), new JButton("9")};
		 
		addComponent(mainPanel, buttons[0], 0, 5, 2, 1, new Insets(0, 5, 5, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);

		addComponent(mainPanel, buttons[1], 0, 4, 1, 1, new Insets(0, 5, 0, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);

		addComponent(mainPanel, buttons[2], 1, 4, 1, 1, new Insets(0, 0, 0, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);

		addComponent(mainPanel, buttons[3], 2, 4, 1, 1, new Insets(0, 0, 0, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);

		addComponent(mainPanel, buttons[4], 0, 3, 1, 1, new Insets(0, 5, 0, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);

		addComponent(mainPanel, buttons[5], 1, 3, 1, 1, new Insets(0, 0, 0, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);

		addComponent(mainPanel, buttons[6], 2, 3, 1, 1, new Insets(0, 0, 0, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);

		addComponent(mainPanel, buttons[7], 0, 2, 1, 1, new Insets(0, 5, 0, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);

		addComponent(mainPanel, buttons[8], 1, 2, 1, 1, new Insets(0, 0, 0, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);

		addComponent(mainPanel, buttons[9], 2, 2, 1, 1, new Insets(0, 0, 0, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);

		buttonDot = new JButton(".");
		addComponent(mainPanel, buttonDot, 2, 5, 1, 1, new Insets(0, 0, 5, 0),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);

		buttonClear = new JButton("С");
		addComponent(mainPanel, buttonClear, 0, 1, 2, 1,
				new Insets(0, 5, 5, 0), GridBagConstraints.CENTER,
				GridBagConstraints.BOTH);

		buttonEqual = new JButton("=");
		addComponent(mainPanel, buttonEqual, 3, 4, 1, 2,
				new Insets(0, 3, 5, 5), GridBagConstraints.CENTER,
				GridBagConstraints.BOTH);

		buttonPlus = new JButton("+");
		addComponent(mainPanel, buttonPlus, 3, 3, 1, 1, new Insets(0, 3, 0, 5),
				GridBagConstraints.CENTER, GridBagConstraints.BOTH);

		buttonMinus = new JButton("-");
		addComponent(mainPanel, buttonMinus, 3, 2, 1, 1,
				new Insets(0, 3, 0, 5), GridBagConstraints.CENTER,
				GridBagConstraints.BOTH);

		buttonMultiply = new JButton("*");
		addComponent(mainPanel, buttonMultiply, 3, 1, 1, 1, new Insets(0, 3, 0,
				5), GridBagConstraints.CENTER, GridBagConstraints.BOTH);

		buttonDivide = new JButton("/");
		addComponent(mainPanel, buttonDivide, 2, 1, 1, 1,
				new Insets(0, 3, 3, 0), GridBagConstraints.CENTER,
				GridBagConstraints.BOTH);
	}

	private void addComponent(Container container, Component component,
			int gridx, int gridy, int gridwidth, int gridheight, Insets insets,
			int anchor, int fill) {
		container.add(component, new GridBagConstraints(gridx, gridy,
				gridwidth, gridheight, 1.0, 1.0, anchor, fill, insets, 0, 0));
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

	public void addActionListenerForSimpleButtons(ActionListener listener) {
		for (JButton button : buttons) {
			button.addActionListener(listener);
		}
	}

	public void addActionListenerFoDot(ActionListener listener) {
		buttonDot.addActionListener(listener);
	}

	public void addActionListenerFoClear(ActionListener listener) {
		buttonClear.addActionListener(listener);
	}

	public void addActionListenerFoAdd(ActionListener listener) {
		buttonPlus.addActionListener(listener);
	}

	public void addActionListenerForSubtraction(ActionListener listener) {
		buttonMinus.addActionListener(listener);
	}

	public void addActionListenerForMultiply(ActionListener listener) {
		buttonMultiply.addActionListener(listener);
	}

	public void addActionListenerForDivide(ActionListener listener) {
		buttonDivide.addActionListener(listener);
	}

	public void addActionListenerForEqual(ActionListener listener) {
		buttonEqual.addActionListener(listener);
	}

	public void updateTextField(String value) {
		textField.setText(textField.getText() + value);
	}

	public void clearTextField() {
		textField.setText("");
	}

	public JTextField getTextField() {
		return textField;
	}
}