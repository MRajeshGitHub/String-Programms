package com.virtusa;

public class StringCopy {

	public static void main(String[] args) {
		// String copy...
		
		String s="ABC tech";
		char[]y=s.toCharArray();
		int size =y.length;
		
		char []a= new char[size];
		
		int i=0;
		while(i!=size) {
			a[i]=y[i];
			++i;
		}
		System.out.println(y);
		System.out.println(a);

	}

}
