package product;

import product.calculator.Calculator;
import product.calculator.CalculatorIplm;

public class Main {

	public static void main(String[] args) {
		Calculator cal=new CalculatorIplm();
		System.out.println("a+ b="+cal.add(4, 5));
		//return b;
		System.out.println("a+ b="+cal.add(44, 2));
		System.out.println("a+ b="+cal.add(12, 4));
		System.out.println("a+ b="+cal.add(15, 6));
	}

}
