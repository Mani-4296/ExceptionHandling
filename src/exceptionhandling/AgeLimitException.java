package exceptionhandling;

import java.util.Scanner;

public class AgeLimitException {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		input.close();

		try {
			if (age > 18) {
				System.out.println("Access granted");
			} else {
				throw new Exception("Your are not eligible to access this");
			}
		} catch (Exception invalidageexception) {
			System.err.println("Error: " + invalidageexception.getMessage());
		}

	}

}
