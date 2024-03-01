package com.virtusa;

public class StringRecv {

	public static void main(String[] args) {
		// String reverce programm
		
		
		String s= "ABC Tech";
		char []y=s.toCharArray();
		int size=y.length;
		
		char []a= new char[size];
		int i=0;
		while(i!=size) {
			a[size-1-i]=y[i];//Reverifies logic
			i++;
		}
		System.out.println(y);
		System.out.println(a);

	}

}
