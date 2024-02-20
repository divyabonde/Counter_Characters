package com.java.counter;

import java.util.*;

public class CounterChara {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String input = sc.nextLine();
		
		int alphabet = 0;
		int digit = 0;
		int specialSymbol = 0;
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			if (Character.isLetter(ch)) {
				alphabet++;
			}
			
			else if (Character.isDigit(ch)) {
				digit++;
			}	
			
			else {
				specialSymbol++;	
			}
		}
		
		System.out.println("Alphabats : " + alphabet);
		System.out.println("Digits : " + digit);
		System.out.println("Special Symbols : " + specialSymbol);
		
		sc.close();
	}

}
