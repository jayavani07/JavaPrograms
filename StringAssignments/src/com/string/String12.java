package com.string;
//Print duplicate characters from the string?
public class String12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="palaganijayavani";
          for(int i=0;i<s.length();i++) {
        	  char c=s.charAt(i);
        	  boolean df=false;
        	  for(int j=0;j<i;j++) {
        		  
        		  if(c == s.charAt(j)) {
        			  df=true;
        			 break;
        			 
        			 
        		  }
        	  }
        	  if(df) {
                 continue;
        	  }
              for(int j=i+1;j<s.length();j++) {
        		if(c == s.charAt(j)) {
        			  System.out.println(c);
        			 break;
        	  
          }

	}

}
	}}
