package exceptionhandling;

import java.util.Scanner;

public class OutofBoundExceptions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Getting the array size from user
		System.out.println("Enter the length of your array: ");
		int size = input.nextInt();
		int[] array = new int[size];
		// Getting array elements from user
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}
		// Getting index position to print from user
		System.out.println("Enter a index position to print: ");
		try {
			int b = input.nextInt();
			System.out.println("Value at index " + b + ": " + array[b]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Index is out of bounds. Please enter a valid index.");
		}
		input.close();
	}
}
