package exceptionhandling;

import java.util.Scanner;

public class ArithmeticException {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int a = input.nextInt();
		System.out.println("Enter second number: ");
		int b = input.nextInt();
		input.close();
		try {
			// Perform the division and store the result in c
			double c = a / b;
			// Print the result if division is successful
			System.out.println("Your output is: " + c);
		} catch (Exception e) {
			// Handle the ArithmeticException if division by zero occurs
			System.err.println("Division operation cannot be processed with this input");
		}
	}
}