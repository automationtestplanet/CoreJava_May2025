package fundamentals;

import calculator.UseCalculator;

public class ImplementNewCalculator extends UseCalculator implements NewCalculator{
	@Override
	public int modDivision(int a, int b) {
		return a%b;
	}
}
