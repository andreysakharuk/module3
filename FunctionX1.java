package module3;

public class FunctionX1 {

	public static void main(String[] args) {
		double a = 1;
		double b = 30;
		double h = 2;
		double x;

		for (x = a; x <= b; x = x + h) {
			double function = 2 * (Math.tan(x / 2)) + 1;
			System.out.println("argument = " + x + " function = " + function);
		}
	}
}
