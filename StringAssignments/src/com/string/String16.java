package com.string;
public class String16 {
//How to swap two strings without using the third variable?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="vani";
		String s1="Jaya";
		System.out.println("Before Swapping the two strings:");
		System.out.println("s  : "+s);
		System.out.println("s1 : "+s1);
		s=s+s1;
		s1=s.substring(0,s.length()-s1.length());
		s=s.substring(s1.length());
		System.out.println("After Swapping the two strings:");
		System.out.println("s  : "+s);
		System.out.println("s1 : "+s1);
		}
	}
