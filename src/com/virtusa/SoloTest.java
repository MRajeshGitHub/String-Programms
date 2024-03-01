package com.virtusa;

public class SoloTest {

	public static void main(String[] args) {
		// String problems and solutions.....
		
		
		String str="Rajesh";//
		String str1="Majhi";
		String s1=new String("juli");
		String s2="juli";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		char[]ch= {'a','b','c'};
		
		String s3=new String(ch);
		
		byte[]b= {65,66,67,68,69,70};
		
		String s4=new String(b);
		
		System.out.println((str+str1).hashCode());
		System.out.println(str.concat(str1).hashCode());
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(ch);
		System.out.println(s3);
		System.out.println(b.toString());
		System.out.println(s4);
		System.out.println("========================");
		
		String ss="Dot saw i was tod";
		String set[]= {"One","Two","Three"};
		int len1=ss.length();
		int len2=set.length;
		System.out.println(len1+"         "+len2);
		
		
		
		
		
		
		

	}

}
