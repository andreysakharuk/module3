package module3;

import java.util.Scanner;

public class FunctionX2 {

	public static void main(String[] args) {

		double x = enterDouble();
		double function = countFunction(x);
		printResult(function);
	}

	public static double enterDouble() {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		return x;
	}

	public static double countFunction(double x) {
		double function;
		if (x <= -3) {
			function = 9;
		} else if (x > 3) {
			function = 1 / (x * x + 1);
		} else {
			function = 0;
		}
		return function;
	}

	public static void printResult(double function) {
		if (function != 0) {
			System.out.print("Function result = " + function);
		} else {
			System.out.print("Function isn't defined");
		}
	}

}
