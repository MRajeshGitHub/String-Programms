package com.virrusa.ratan;

@FunctionalInterface
interface Greeting{
	void greet();
}

public class LamdaTest1 {

	public static void main(String[] args) {
		Greeting g=()->System.out.println("Greeting impliments using Lamda.....");
		g.greet();
		
		System.out.println("-------------------------------");
		Greeting g2=()->{
			System.out.println("greetin explation......");
			System.out.println("Second line in lamda exp.....");
		};
		
		g2.greet();

	}

}
