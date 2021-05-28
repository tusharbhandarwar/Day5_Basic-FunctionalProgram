package com.bridgelabz;
import java.util.*;

public class PrimeFactors {
	public static void main(String[] args) {
		int number;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number ");
	      number = sc.nextInt();
	      //checking the number is prime and checking the prime factors using for loop
	      for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      //printing prime factors
	      if(number > 2) {
	         System.out.println(number);
	      }
	}

}
