package com.bridgelabz;
import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		// Checking Even or Odd
		int num;
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is odd");
		}
						
	}

}
