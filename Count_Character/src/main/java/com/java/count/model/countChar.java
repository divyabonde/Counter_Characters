package com.java.count.model;

public class countChar {
	private int alphabet;
	private int digit;
	private int specialSymbol;
	
	public countChar(int alphabet, int digit, int specialSymbol) {
		super();
		this.alphabet = alphabet;
		this.digit = digit;
		this.specialSymbol = specialSymbol;
	}
	
	public int getAlphabet() {
		return alphabet;
	}
	public void setAlphabet(int alphabet) {
		this.alphabet = alphabet;
	}
	public int getDigit() {
		return digit;
	}
	public void setDigit(int digit) {
		this.digit = digit;
	}
	public int getSpecialSymbol() {
		return specialSymbol;
	}
	public void setSpecialSymbol(int specialSymbol) {
		this.specialSymbol = specialSymbol;
	}
	
	
}
