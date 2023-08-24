package com.string;
/*Write a program to delete all consonants from the string Hello, have a
good day.*/
public class String9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Hello,have a good day.";
        String result=" ";
        int c=0;
        for(int i=0;i<s.length();i++) {
        	char ch=s.charAt(i);
        		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch==' '|| ch==','|| ch=='.') {
        			
        			     result=result+ch;
        		}
        }
        
	
        System.out.println("After deleting consonants in the String : "+result);
        
}
	}
