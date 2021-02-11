package com.encapsulation;

public class GooglePayServer 
{
public static void main(String[]args)
{
	GooglePay user1=new GooglePay("Ajay",123456789L,6749);
	
	String userName=user1.getuserName();
	System.out.println("userName="+userName);
	
	long contactnum=user1.getcontactnum();
	System.out.println("contactnum="+contactnum);
	
	int pinNo=user1.getpinNo();
	System.out.println("pinNo="+pinNo);
	
	user1.setuserName("Dinesh");
	user1.setcontactnum(369852147L);
	user1.setpinNo(4361);
	
	String updatedUserName=user1.getuserName();
	System.out.println("updatedUserName="+updatedUserName);
	
	long updatedcontactnum=user1.getcontactnum();
	System.out.println("updatedcontactnum="+updatedcontactnum);
	
	int updatedpinNo=user1.getpinNo();
	System.out.println("updatedpinNo="+updatedpinNo);
}
}
