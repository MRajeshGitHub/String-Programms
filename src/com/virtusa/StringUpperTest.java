package com.virtusa;

public class StringUpperTest {

	public static void main(String[] args) {
		// String lower case to upper case programm
		
		String x="RAJESH";
		System.out.println(x.toUpperCase());
		
		char []a=x.toCharArray();
		int size = a.length;
		
		int i=0;
		
		while(i!=size) {
			a[i]=(char)(a[i]+32);
			i++;
		}
		System.out.println(a);

	}

}
