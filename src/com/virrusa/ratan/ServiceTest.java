package com.virrusa.ratan;

interface Service{
	String ligin(String uname,String upass);
}



public class ServiceTest {

	public static void main(String[] args) {
		
		Service s=(uname,upass)->{
			return  uname.equalsIgnoreCase("rajesh") && upass.equals("Raj@123") ?"Login success":"login fail";
		};
		String ss=s.ligin("raesh", "Raj@123");
		System.out.println("your login is  :"+ss);
		
		
		Service s1=(uname,upass)->{
			return uname.equalsIgnoreCase("shubham") && upass.equals("raja")?"loging sucess":"login fail";
		};
		String s2=s1.ligin("Shubham", "raja");
		System.out.println(s2);

	}

}
