package com.string;
//Write a program to check if the letter e is present in the word Umbrella.
public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Umbrella";
        char letter='e';
       boolean lp=false;
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)==letter) {
		      lp=true;
        		
        	}
        }
        if(lp) {
        	System.out.println("The letter "+letter+" is Present in the word "+s);
        }
        else
        {
        	System.out.println("The letter "+letter+" is  not Present in the word "+s);
        }
	}

}
