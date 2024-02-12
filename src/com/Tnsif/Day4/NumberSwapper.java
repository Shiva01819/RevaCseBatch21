package com.Tnsif.Day4;

public class NumberSwapper {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	     
	        System.out.print("Enter the first number: ");
	        int firstNumber = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int secondNumber = scanner.nextInt();

	        firstNumber = firstNumber ^ secondNumber;
	        secondNumber = firstNumber ^ secondNumber;
	        firstNumber = firstNumber ^ secondNumber;

	        // Display swapped numbers
	        System.out.println("Swapped Numbers: First = " + firstNumber + ", Second = " + secondNumber);

	       
	        scanner.close();

		// TODO Auto-generated method stub

	}

}
