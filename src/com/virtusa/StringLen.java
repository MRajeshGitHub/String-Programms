package com.virtusa;

public class StringLen {

	public static void main(String[] args) {
		// String length usin inbuilt methods
		
		int count=0,i=0;
		String s="ABC Tech";
		s=s.concat("\0");//adding null at the the end of the string
		char[] y=s.toCharArray();
		
		while(y[i]!='\0') {
			count ++;
			i++;
		}

		System.out.println(count);
		System.out.println(s.charAt(4));
	}

}
