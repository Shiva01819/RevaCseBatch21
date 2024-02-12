package com.Tnsif.Day4;

import java.util.Scanner;

public class SkyAirlines {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
			System.out.println("Enter a name");
			String name= scanner.nextLine();
			
			System.out.println("Enter source");
			String source = scanner.nextLine();
			
			System.out.println("Enter destination");
			String destination=scanner.nextLine();
			
			System.out.println("Dear" + name+",welcome to dubai " + source + ",to" +destination+",Dear Jack,welcome onboard with service from Dubai to Chicago.Thank you for choosing Sky Airlines.Enjoy Your Flight" );
			scanner.close();
		// TODO Auto-generated method stub

	}

}
