package com.bridgelabz;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b =30;
		int temp ;
		System.out.println("Before swapping:"+a+" " +b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping:"+a+" " +b);
		//Swapping two numbers without using 3rd variable
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping without using Temp variable:"+a+ " " +b);

	}

}
