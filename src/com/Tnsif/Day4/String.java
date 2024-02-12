package com.Tnsif.Day4;

public class String {
	public static void main(String args[])
	{
		String levelString ="expert";
		int level =6;
		switch(levelString)
		{
		case "Begineer":level=1;
		break;
		case "intermidiate":level=3;
		break;
		case "expert":level=6;
		break;
		default:
			System.out.println("invalid");
		
		}
		System.out.println("your level is" + level);
		
		
	}

}
