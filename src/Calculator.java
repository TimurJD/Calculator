import com.calculator.controller.CalculatorController;
import com.calculator.model.MathOperator;
import com.calculator.view.CalculatorView;

/**
* @author Timur Berezhnoi tima.peaceworld@gmail.com
*/
public class Calculator {
	public static void main(String[] args) {
		new CalculatorController(new CalculatorView(), new MathOperator());
	}
}