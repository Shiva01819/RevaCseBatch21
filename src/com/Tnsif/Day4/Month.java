package com.Tnsif.Day4;

public class Month {

	public static void main(String[] args) {
		int month=7;
		String monthString ="";
		switch(month)
		{
		case 1:monthString="1-january";
		break;
		case 2:monthString="2-febrauary";
		break;
		case 3:monthString="3-march";
		break;
		case 4:monthString="4-april";
		break;
		case 5:monthString="5-may";
		break;
		case 6:monthString="6-june";
		break;
		case 7:monthString="7-july";
		break;
		default:
			System.out.println("invalid month");
		
		}
		System.out.println(monthString)
		// TODO Auto-generated method stub

	}

}
