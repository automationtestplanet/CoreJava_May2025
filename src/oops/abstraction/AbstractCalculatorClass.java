package oops.abstraction;

abstract public class AbstractCalculatorClass {

	/**
	 * Description: This method performs addition operation on two numbers and
	 *               returns integer value
	 * @author RAJU CHELLE
	 * @param a
	 * @param b
	 * @return
	 */
	abstract public int addition(int a, int b);

	/**
	 * Description: This method performs subtraction operation on two numbers and
	 *               returns integer value
	 * @author RAJU CHELLE
	 * @param a
	 * @param b
	 * @return
	 */
	abstract public int subtraction(int a, int b);

	/**
	 * Description: This method performs multiplication operation on two numbers
	 *               and returns integer value
	 * @author RAJU CHELLE
	 * @param a
	 * @param b
	 * @return
	 */
	abstract public int multipliation(int a, int b);

	public int division(int a, int b) {
		return a / b;
	}
	
	public int modDivison(int a, int b) {
		return a%b;
	}
}
