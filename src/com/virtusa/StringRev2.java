package com.virtusa;

public class StringRev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Rajesh";
		
		char []a=s.toCharArray();
		
		int size= a.length;
		
		char []y= new char[size];
		
		int i=0;
		while(i!=size) {
			y[size-1-i]=a[i];
			i++;
		}
		System.out.println(a);
		System.out.println("----------------------");
		System.out.println(y);
	}

}
