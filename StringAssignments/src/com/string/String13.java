package com.string;
/*Write a program to count the occurrence of the given character
in a string? */
public class String13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="Jayavani";
         char c='a';
         int count=0;
         for(int i=0;i<s.length();i++) {
        	 char c1=s.charAt(i);
        	 if(c==c1) {
        		 
        		 count++;
        	 }
        	 
         }
         System.out.println("Occurrence of character  "+c+" in the String : "+count);
	}

}
