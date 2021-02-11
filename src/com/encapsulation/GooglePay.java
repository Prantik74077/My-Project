package com.encapsulation;

public class GooglePay                      //java bean design pattern/java bean class
{
private String userName;
private long contactnum;
private int pinNo;

public GooglePay(String userName,long contactnum,int pinNo)
{
this.userName=userName;
this.contactnum=contactnum;
this.pinNo=pinNo;
}
public String getuserName()     // Binding the Code and data as a Single unit is known as Encapsulation
{
	return userName;
}
public long getcontactnum()
{
	return contactnum;
}
public int getpinNo()
{
	return pinNo;
}

public void setuserName(String userName)
{
	this.userName=userName;
}
public void setcontactnum(long contactnum)
{
	this.contactnum=contactnum;
}
public void setpinNo(int pinNo)
{
	this.pinNo=pinNo;
}
}
