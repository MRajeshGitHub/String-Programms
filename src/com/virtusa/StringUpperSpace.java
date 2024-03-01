package com.virtusa;

public class StringUpperSpace {

	public static void main(String[] args) {
		// String program for lower case to upper case with spaces...
		
		String x="aradhya briliance center";
		 char []a=x.toCharArray();
		 int size =a.length;
		 
		 int i=0;
		 while(i!=size) {
			 
			 if(a[i]!= ' ') {
				 a[i]=(char)(a[i]-32);
				 
			 }
			 i++;
		 }
System.out.println(a);
	}

}
