package module3;

import java.util.Scanner;

public class Line01 {

	public static void main(String[] args) {
		int number = enterNumber();
		findEvenNumber(number);
	}
	
	public static int enterNumber() {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.print("Введите число: ");
		if (sc.hasNextInt())
		number = sc.nextInt();
	return number;
	}
	
	public static void findEvenNumber(int number ) {
		while (number != 0) {
			int digit = number % 10;
			number = number / 10;
			if (digit % 2 == 0) {
			System.out.println("В числе есть четная цифра.");
			return;
			}
		}
	System.out.println("В числе нет четных цифр.");		
	}

}
