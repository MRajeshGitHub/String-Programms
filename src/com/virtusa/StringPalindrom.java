package com.virtusa;

public class StringPalindrom {

	public static void main(String[] args) {
		// String palindrom program
		
		String x="REFER";
		x=x.replace(" ", "");
		x=x.toLowerCase();
		
		char []y=x.toCharArray();
		
		int size =y.length;
		
		char []a= new char[size];
		
		int i=0;
		
		while(i!=size) {
			a[size-1-i]=y[i];
			i++;
			System.out.println(a);
		}
		System.out.println("-------------------");
		System.out.println(y);
		System.out.println(a);
		
		i=0;
		while(i!=size) {
			System.out.println("----------------ii");
			if(a[i]!=y[i]) {
				System.out.println("not a palindrom no.");
				System.exit(0);
			}
			else {
				i++;
				continue;
			}
			System.out.println(" a palindrom no....");
		}
		
			}
	
}
