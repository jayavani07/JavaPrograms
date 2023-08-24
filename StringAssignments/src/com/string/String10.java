package com.string;
/*Input a string of alphabets. Find out the number of occurrence of all
alphabets in that string. Find out the alphabet with maximum occurrence.*/
public class String10 {
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   String s="helloiamjayavani";
        int occurrenceArray[]=new int[26];
        for(int i=0;i<s.length();i++) {
        	char ch=s.charAt(i);
        	if(ch>='a'&&ch<='z') {
        		int index=ch-'a';
        		occurrenceArray[index]++;
        	}
        }
        int maxocc=-1;
        int maxindex=-1;
        
	}

}
