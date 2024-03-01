package com.virrusa.ratan;

@FunctionalInterface
interface ServiceA{
	String voteCheck(String name,int age,String loc);
}

public class VoterCheck {

	public static void main(String[] args) {
		
		ServiceA s=(name,age,loc)->{
			return age>=18 && loc.equals("Hyderabad")?"can vote":"not vote";
		};

		String ss=s.voteCheck("Rajesh", 12, "Hyderabad");
		System.out.println("vote status  :"+ss);
	}

}
