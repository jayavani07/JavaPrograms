package com.string;
/*Write a program to find the number of vowels, consonants, digits and white
space characters in a string.*/
public class String8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Jaya vani 07 ";
		int v=0 ;
		int c=0;
		int d=0;
		int sp=0;
		
        for(int i=0;i<s.length();i++) {
        	char ch=s.charAt(i);
        	if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z') ){
        		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
        			
        			      v++;    
        		}else {
        			c++;
        		}
         }else if(ch>='0' && ch<='9') {
        			d++;
        		}
         else if(ch==' '||ch<='\t'||ch=='\n') {
        	 sp++;
        		
        	}
        }
        System.out.println("Vowels : "+v);
        System.out.println("Consonants : "+c);
        System.out.println("digits : "+d);
        System.out.println("Whitespaces : "+sp);
        
	}

}
