package com.Patteren;

import org.testng.annotations.Test;

public class Programs {

	String s1 ="HelloNewJava" ;
	String s2 ="hel01234567" ;
	
	@Test
	public void substring()
	{
		String subString = s1.substring(5);
		System.out.println("subString is =>"+ subString); // newjava
		
		String subString2 = s1.substring(2, 9);
		System.out.println("begin and ending with index="+subString2);
		
	}
	// SubString basically used for the where to start and start to end
	
	@Test
	public void String()
	{
		String name = "Pritesh";
		String one = " ";
		for(int i = 0 ; i<=name.length()-1; i++)
		{
		      one = one + name.charAt(i);
		      System.out.println(one);
		}
	}

	 
}
