package product.calculator;

public class CalculatorIplm implements Calculator{

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int addOne(int a) {
		// TODO Auto-generated method stub
		return a++;
	}

}
