package com.string;
//Write a program to remove given characters from the string?
public class String11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="hello world!";
      char c='r';
      String result="";
      for(int i=0;i<s.length();i++) {
    	  char currentchar=s.charAt(i);
    	  if(currentchar!=c) {
    		  result=result+currentchar;
    	  }
    	
      }
      System.out.println("After removing character :"+result);
	}

}
