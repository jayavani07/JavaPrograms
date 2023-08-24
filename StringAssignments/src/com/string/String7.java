package com.string;
/*Write a program that takes your full name as input and displays the
abbreviations of the first and middle names except the last name which is
displayed as it is. For example, if your name is Robert Brett Roser, then the
output should be R.B.Roser.*/
public class String7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Robert Brett Roser";
		String abbrivations="";
        int si =s.indexOf(' ');
        //firstname
        abbrivations=abbrivations+s.charAt(0)+".";
        //middlename
        if(si!=-1) {
        	abbrivations=abbrivations+s.charAt(si + 1)+".";	
        }
        //lastname
        abbrivations=abbrivations+s.substring(si + 7);
        System.out.println("Abbrivations: "+abbrivations);
        
	}

}
