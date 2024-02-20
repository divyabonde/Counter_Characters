package com.java.count.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.count.model.countChar;

@RestController
public class countCharacter {
	
	@PostMapping("/count")
	public countChar countCharacter(@RequestBody String input) {
		int alphabet = 0;
		int digit = 0;
		int specialSymbol = 0;
		
		for (char c : input.toCharArray()) {
			if(Character.isLetter(c)) {
				alphabet++;
			} else if (Character.isDigit(c)) {
				digit++;
			}else {
				specialSymbol++;
			}
		}
		
		countChar resultChar = new countChar(alphabet, digit, specialSymbol);
		return resultChar;
	}
}
