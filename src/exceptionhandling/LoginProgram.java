package exceptionhandling;

import java.util.Scanner;

public class LoginProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Simulating correct password
		String correctPassword = "P@assword";

		// Getting user input for password
		System.out.println("Enter your password: ");
		String enteredPassword = input.nextLine();
		input.close();
		// Using try-catch to handle incorrect password
		try {
			if (!enteredPassword.equals(correctPassword)) {
				throw new Exception("Incorrect password. Please try again.");
			}
			System.out.println("Login successful!");
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
