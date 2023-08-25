package com.string;
public class String18 {
//Java String Program to Print even length words.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []s={"this","is","palagani","jayavani"};
	
		System.out.println("Number of even length words:");
		for(String word: s){
			if(word.length()%2==0) {
				System.out.println(word);
			}
		}
	}
}

