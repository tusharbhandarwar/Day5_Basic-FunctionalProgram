package com.bridgelabz;
import java.util.Scanner;
public class CheckVowelConsonant {

	public static void main(String[] args) {
		// Checking Albhabet is Vowels or Consonant
	System.out.println("Enter a albhabet");
	
	Scanner sc = new Scanner(System.in);
	
	char ch = sc.next().charAt(0);
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	{
		System.out.println("Character is Vowel");
	}
	else 
	{
		System.out.println("Character is Consonant");
	}
		
}

}
