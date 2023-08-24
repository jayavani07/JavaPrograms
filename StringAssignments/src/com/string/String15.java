package com.string;

public class String15 {
	/*Write a program to count the number of words in a given string
	sentence?*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="this is jayavani";
        int wordcount=0;
        boolean flag=false;
        for(int i=0;i<s.length();i++) {
       	 char c1=s.charAt(i);
       	 if(c1!=' ') {
       		 if(!flag) {
       			 flag=true;
       		 wordcount++;
       		 }
       	 }
       		 else {
       			 flag=false;
       		 }
       	 
        }
        System.out.println("Number of words: "+wordcount);
        
	}

}
