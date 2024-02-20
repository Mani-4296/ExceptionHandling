package exceptionhandling;

import java.util.Scanner;

public class StringException {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Getting the string from user
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		// Getting index position to print from user
		System.out.println("Enter an index position to print: ");
		try {
			int index = input.nextInt();
			char character = str.charAt(index);
			System.out.println("Character at index " + index + " is: " + character);
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("String Index is out of bounds. Please enter a valid index.");
		}
		input.close();
	}
}
