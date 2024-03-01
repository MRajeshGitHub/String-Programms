package com.virtusa;

public class StringFirstUpperLater {

	public static void main(String[] args) {
		// program to write first latter upper caharachter
		
		String s="aradhya briliance center";
		
		char []a=s.toCharArray();
		
		int size=a.length;
		
		int i=0;
		a[0]=(char)(a[i]-32);
		while(i!=size) {
			
			if(a[i]== ' ') {
				a[i+1]=(char)(a[i+1]-32);
			}
			i++;
		}
		System.out.println(s);
		System.out.println(a);
	}

}
