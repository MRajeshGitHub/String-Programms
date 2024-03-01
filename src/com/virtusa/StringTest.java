package com.virtusa;


class Test{
	String s;
	public Test(String s) {
		this.s=s;
	}
}
public class StringTest {

	public static void main(String[] args) {
		
		Test t=new Test("hellow");
		Test t1=new Test("hellow");
		Test t2=new Test("hellowq");
		String s1= new String("world");
	
		System.out.println(t.hashCode()+"    "+t1.hashCode()+"   "+t2.hashCode()+"   "+s1.hashCode());

	}

}
