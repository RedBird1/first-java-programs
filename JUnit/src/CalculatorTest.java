import junit.framework.TestCase;

import org.junit.Test;


public class CalculatorTest extends TestCase{


	
	public void testAdd() {
		Calculator calc = new Calculator();

		double result = calc.addTwoNumbers(10,50);
		assertEquals(60, result,0);
		//double result = calc.addTwoNumbers(10, 50);
		
	}

}
