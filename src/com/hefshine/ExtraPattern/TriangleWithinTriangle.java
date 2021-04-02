/*
*****************
 ******* ******* 
  *****   *****  
   ***     ***   
    *********    
     *******     
      *****      
       ***       
        *  
 */
package com.hefshine.ExtraPattern;

public class TriangleWithinTriangle 
{

	public static void main(String[] args) 
	{
		for(int i=0;i<=8;i++)
		{
			for (int j = 0; j <=16; j++) 
			{
				if(j-i>=0 &&i+j<=8 ||j-i>=8 && i+j<=16 ||i>3 && j-i>=0 && i+j<=16) //j-i>=0 &&i+j<=8 || j-i>=8 && i+j<=16 ||i>3 && j-i>=0 && i+j<=16
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
