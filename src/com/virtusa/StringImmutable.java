package com.virtusa;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=new String("hello");
		String s1=s;
		String s2=new String("h ello");
		boolean retVal;
		
		retVal=s.equals(s2);
		System.out.println(retVal);
		
		
		
		
		
		
		
		
		/*
		 * String s="Naresh techonology"; char result=s.charAt(8);
		 * System.out.println(result); System.out.println(s.charAt(3));
		 * 
		 */
		/*
		 * String s="string is immutable"; String ss="string is immutable"; String
		 * sss="integers are not immutable"; System.out.println(s+"   "+ss+"   "+sss);
		 * int result=s.compareTo(ss); int result1=ss.compareTo(sss);
		 * System.out.println(result); System.out.println(result1);
		 */
	}

}
