package com.virtusa;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// String is anagram or not...
		
		String s="silent";
		String ss="listen";
		
		s=s.replace(" ", "");
		ss=ss.replace(" ", "");
		
		s=s.toLowerCase();
		ss=ss.toLowerCase();
		
		
		char []a=s.toCharArray();
		char []b=s.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);

		
		
		Boolean result=Arrays.equals(a, b);
		
		if(result==true) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("not anagram");
		}
		
		
		
		
		

	}

}
