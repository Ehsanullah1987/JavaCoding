package com.class6;

import java.util.Scanner;

public class SwitchAndScanner {
public static void main(String[] args) {
	/* Ask user to enter their gender F or M
	 * base on the input provide
	 * if f---> female
	 * if M--->Male
	 * otherwise -->unknown
	 * 
	 */
	Scanner Scan=new Scanner(System.in);
	System.out.println("Please enter your gender: F or M");
	char gender=Scan.next().charAt(0);
	String userGender;
	switch (gender) {
	case 'F':
		userGender="Female";
		break;
	case 'M':
		userGender="Male";
		break;
		default:
			userGender="unknown";
	}
	System.out.println("Your gender is "+userGender);
}
}
