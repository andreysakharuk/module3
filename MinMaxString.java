package module3;

import java.util.Scanner;

public class MinMaxString {

	public static void main(String[] args) {
		String[] result = countMinMax();
		printResult(result);
	}
	
	public static String[] countMinMax() {
		int n = 10;
		Scanner sc = new Scanner(System.in);
		String max = "", min = "", str = "";
		for (int i = 0; i < n; i++) {
			System.out.print("> ");
		if (sc.hasNextLine()) {
			str = sc.nextLine();
		if (i == 0) {
			min = str;
		}
		if (str.length() > max.length()) {
			max = str;
		} else if (str.length() < min.length()) {
			min = str;
		}
		}
		}
		String[] result = {min, max};
	return result;
	}

	public static void printResult(String[] result) {
		System.out.println("max string = " + result[1] + " length=" + result[1].length());
		System.out.println("min string = " + result[0] + " length=" + result[0].length());		
	}
}