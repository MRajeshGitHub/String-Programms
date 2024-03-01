package com.virrusa.ratan;

@FunctionalInterface
interface Operation{
	void add(int a,int b);
}


public class OperationTest {

	public static void main(String[] args) {
		
		Operation o=( a, b)->System.out.println(a+b);
		o.add(11, 45);

	}

}
