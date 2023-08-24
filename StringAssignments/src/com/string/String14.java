package com.string;
//Write a program to remove given characters from the string?
public class String14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Jayavanip";
	    String  c="vp";
	    StringBuilder result= new StringBuilder();
	      for(int i=0;i<s.length();i++) {
	    	  char currentchar=s.charAt(i);
	    	  if(c.indexOf(currentchar)==-1) {
	    		  result.append(currentchar);
	    	  }
	    	
	      }
	      String res=result.toString();
	      System.out.println("After removing character :"+res);
	}

}
