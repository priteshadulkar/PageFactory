package com.Patteren;

import org.testng.annotations.Test;

public class pattern1st
{/*
   //  * 
       * * 
       * * * 
       * * * * 
       * * * * * 
   /// * * * * * * 
*/	
	public void patteren()
	{
		int i , k ;
		for( i = 0; i<=5 ; i++)
		{
			System.out.print(" ");
	
	   for( k =0 ; k<=i ;k++)
		{
				System.out.print("* ");
		}
	   
	   System.out.println();
		}
		
	}
	/**
    **
   ***
  ****
 *****
*******/
	
	
       public void Leftpatteren()
       {
    	   for (int i= 0; i<= 5; i++)
           {
               for (int j=1; j<=5-i; j++)
               {
                   System.out.print(" ");// it print 1st space 5 than * // 2nd it print 4 space and * *
               }
               for (int k=0;k<=i;k++)
               {
                   System.out.print("*");
               } 
                   System.out.println("");
           }
    	   
    	  }
//       * * * * * 
//        * * * * 
//         * * * 
 //         * * 
//           * 
       
	
    public void RightPatteren()
    {
		
		for (int i= 0; i<= 5-1 ; i++) //
	    {
	        for (int j=0; j<=i; j++)
	        {
	            System.out.print(" ");// space than * with space
	        }
	        for (int k=0; k<=5-1-i; k++)
	        {
	            System.out.print("*" + " ");
	        }
	        System.out.println();
	    }
		
   
    
    }
	
/*	*****
	 ****
	  ***
	   **
	    **/
   // @Test
	public void mirroepatteren()
    {
		
		for (int i= 0; i<= 5-1 ; i++) //
	    {
	      for( int j =0 ; j<=i ; j++)
	      {
	    	  System.out.print(" ");
	      }
	      for( int k =1; k<=5-i; k++)
	      {
	    	  System.out.print("*");
	      }
	      System.out.println();
	    }
	}
	  
  /*  * 
   * * 
  * * * 
 * * * * 
* * * * * */
    
    @Test
    public void mirro()
    {
    	for (int i= 0; i<= 5 ; i++)
    	{
    		for(int j = 1 ; j<=5-i ; j++)
    		{
    			System.out.print(" ");
    		}
    		
    		for(int k=1;k<=i ;k++)
    		{
    			System.out.print( "*"+ " ");
    		}
    		System.out.println();
    	}
    	
    	
    	
    	
    }

	
	
	
}
