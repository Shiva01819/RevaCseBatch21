package com.day7.tnsif;

public class Addition
{
	public static void main(String args[])
	{
		int a = 6;
		int b=7;
		int c= add(a, b);
		System.out.println("the addition of two number is =" + c);
	}
	public static int add(int n1 ,int n2)
	{
		int S;
		 S=n1+n2;
		return S;
		
	}
}