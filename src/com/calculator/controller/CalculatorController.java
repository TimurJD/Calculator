package com.calculator.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.calculator.model.Calculable;
import com.calculator.model.Operation;
import com.calculator.view.CalculatorView;

/**
 * @author Timur Berezhnoi tima.peaceworld@gmail.com
 */
public class CalculatorController {

	private double firstValue;
	private double secondValue;
	private double result;

	private Operation operation;

	private CalculatorView view;
	private Calculable model;

	public CalculatorController(CalculatorView view, Calculable model) {
		this.view = view;
		this.model = model;

		view.addActionListenerForSimpleButtons(new SimpleButtonListener());
		view.addActionListenerFoDot(new DotListener());
		view.addActionListenerFoClear(new ClearListener());
		view.addActionListenerFoAdd(new AdditionListener());
		view.addActionListenerForSubtraction(new SubtractionListener());
		view.addActionListenerForMultiply(new MultiplyListener());
		view.addActionListenerForDivide(new DivideListener());
		view.addActionListenerForEqual(new EqualListener());
	}

	class SimpleButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			view.updateTextField(((JButton) event.getSource()).getText());
		}
	}

	class DotListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			if (view.getTextField().getText().contains(".")) {
				return;
			} else {
				view.updateTextField(((JButton) event.getSource()).getText());
			}
		}
	}

	class ClearListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			firstValue = 0;
			secondValue = 0;
			view.clearTextField();
		}
	}

	private void mathOperation(Operation operation) {
		String input = view.getTextField().getText();
		if ("".equals(input)) {
			return;
		} else {
			this.operation = operation;
			firstValue = Double.valueOf(input);
			view.clearTextField();
		}
	}

	class AdditionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			mathOperation(Operation.ADDITION);
		}
	}

	class SubtractionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			mathOperation(Operation.SUBTRACTION);
		}
	}

	class MultiplyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			mathOperation(Operation.MULTIPLY);
		}
	}

	class DivideListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			mathOperation(Operation.DIVIDE);
		}
	}

	class EqualListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			String input = view.getTextField().getText();

			if ("".equals(input) || operation == null) {
				return;
			} else {
				secondValue = Double.valueOf(input);
				switch (operation) {
				case ADDITION:
					result = model.doAddition(firstValue, secondValue);
					break;
				case SUBTRACTION:
					result = model.doSubtraction(firstValue, secondValue);
					break;
				case MULTIPLY:
					result = model.doMultiply(firstValue, secondValue);
					break;
				case DIVIDE:
					result = model.doDivide(firstValue, secondValue);
					break;
				default:
					break;
				}
				
				if (Double.isInfinite(result)) {
					view.getTextField().setText("Don't divide by zero!");
					return;
				} else if (Double.isNaN(result)) {
					view.getTextField()
							.setText("Don't divide by zero by zero!");
					return;
				}

				if ((result % 2) == 0.0 || (result % 2) == 1.0) {
					view.getTextField().setText(String.valueOf((int) result));
				} else {
					view.getTextField().setText(String.valueOf(result));
				}
//				firstValue = 0;
//				secondValue = 0;
			}

		}
	}
}