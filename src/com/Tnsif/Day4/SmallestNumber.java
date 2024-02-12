package com.Tnsif.Day4;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the FirstNumber");
		int num1 =sc.nextInt();
		
		System.out.println("Enter the second Number");
		int num2= sc.nextInt();
		
		System.out.println("Enter the Third Number");
		int num3 = sc.nextInt();
		int SmallestNumber =(num1<num2)?(num1<num3 ?num1:num3):(num2<num3 ? num2:num3);
		System.out.println("The smallest Number is " + SmallestNumber);

		
	
				
		// TODO Auto-generated method stub

	}

}
