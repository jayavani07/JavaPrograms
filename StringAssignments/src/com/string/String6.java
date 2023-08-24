package com.string;
/*Write a program to find the first 'o' and the last occurence of the letter ',' and
character "Hello, World".*/
public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello, World";
		char c='o';
		char c1=',';
		int fo1=s.indexOf(c);
		int lo1=s.lastIndexOf(c);
		int fo2=s.indexOf(c1);
		int lo2=s.lastIndexOf(c1);
		System.out.println("first occurence of "+c+" is :"+fo1);
		System.out.println("last occurence of "+c+" is :"+lo1);
		System.out.println("first occurence of "+c1+" is :"+fo2);
		System.out.println("last occurence of "+c1+" is :"+lo2);

	}

}
