package com.string;
//Write a program to check if the word orange is present in the This is orange juice.
public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Orange juice";
		String s1="Orange";
		int index=s.indexOf(s1);
		if(index!=-1) {
			System.out.println(" the "+s1+" is present in the string "+s);
		}
		else {
			System.out.println(" the "+s1+" is  not present in the string "+s);
		}

	}

}
