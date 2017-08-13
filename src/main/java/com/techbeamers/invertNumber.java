package com.techbeamers;

//Write a function to reverse a number in Java?
public class invertNumber {
	public long doInvert(long number) {
		 
		long invert = 0;
		while (number != 0) {
			invert = (invert * 10) + (number % 10);
			number = number / 10;
		}
		return invert;
	}
 
	public static void main(String args[]) {
		long lnum = 654321;
		StringBuffer stb= new StringBuffer("654321");
		stb=stb.reverse();
		invertNumber input = new invertNumber();
 
		System.out.println("Input value : " + lnum);
		System.out.println("Inverted value : " + input.doInvert(lnum));
	    System.out.println("StringBuffer inverse: "+stb);
	}
}
