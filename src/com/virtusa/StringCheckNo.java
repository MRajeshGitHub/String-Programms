package com.virtusa;

public class StringCheckNo {

	public static void main(String[] args) {
		// program to write to chek given stirng hold no. or not
		
		
		String s="12ABc";
		
		//char []y=s.toCharArray();
		
		
		int size=s.length();
		
		int i=0;
		
		while(i!=size) {
			
			if(s.charAt(i)>= '0' && s.charAt(i) <='9') {
			
				i++;
			}
			else {
				System.out.println("given string not an intger...");
				System.exit(0);
			}
			
		}
		System.out.println("given string is no.");

	}

}
