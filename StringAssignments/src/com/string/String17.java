package com.string;
public class String17 {
//How to reverse a String in Java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		String reverse=" ";
		for(int i=s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println("Original string : "+s);
		System.out.println("Reverse string : "+reverse);
		}
}
