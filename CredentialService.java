package com.greatlearning.service;

import java.util.Random;

public class CredentialService {
	
	public static String generateEmailAddress(String firstName, String lastName, String department) {
		
		// firstNamelastName@department.company.com
		
		System.out.println("Dear Anand your Credentials are as follows ");
		return " "+ firstName + lastName + "@" + department+ ".abc.com";
	}
	
	
	public String generateRandomPassword() {
		String numbers = "1234567890";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specialCharacters = "!@#$%^&*()_-+=<>?{};':";
		
		String values = numbers+smallLetters+capitalLetters+specialCharacters;
		
		Random random = new Random(); 
		char[] password = new char[8];
		for (int i=0;i<8;i++) {
			
			password [i] = values.charAt(random.nextInt(values.length()));
		}
		return password.toString() ; 
		
	}
	
	public static void showCredentials(String email, String password) {
		
		System.out.println("Email -->  :- "+email);
		System.out.println("Password --> :-" + password);
		
	}
}
