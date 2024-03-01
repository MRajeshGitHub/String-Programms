package com.virtusa;

public class StringPangram {

	public static void main(String[] args) {
		// program to write givrn steing is pangram or not..
		
		String s="He is aradya ";
		s=s.replace(" ", "");
		
		char []y=s.toCharArray();
		
		int size=y.length;
		
		int []a= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		//System.out.println(a.length);
		
		int i=0;
		while(i!=size) {
			int index=y[i]-65;
			a[index]=1;
			i++;
		}
		i=0;
		while(i!=26) {
			
			if(a[i]==1) {
				++i;
			}
			else {
				System.out.println("non panagram");
				System.exit(0);
			}
			System.out.println("panagram");
		}

	}

}
