package com.jenkins;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

public class Stringsort {
	String s1[] = {"a","b" , "c1" ,"d","a","b" , "c1" ,"d1","a","b" , "c" ,"d"} ;
    int count ;
    @Test
	public void String()
	{
    	ArrayList<String> hs = new ArrayList<String>();
    	System.out.println(s1.length);
		  for(int i = 0 ; i<s1.length-1 ;  i++)
		    {
			   count = 0 ;
		
		       for(int j = i+1; j<s1.length-1 ;  j++)
	     	   {
		       	  if(s1[i].equals(s1[j]))
		       	  {
		       		 
		       		  hs.add(s1[i]) ;
		       		 Collections.sort(hs);
		       		 System.out.println(hs);
		       	  }
		       	 
		       	}
		       
		       
	       }
		  System.out.println(hs);
		  Collections.sort(hs);
    		 System.out.println(hs);
		 
  }
	
}
