/*
        1 
       1 2 
      1 2 3 
     1 2 3 4 
    1 2 3 4 5 
   1 2 3 4 5 6 
  1 2 3 4 5 6 7 
 1 2 3 4 5 6 7 8 
1 2 3 4 5 6 7 8 9 
*/
package com.hefshine.pattern;

public class Pattern53 
{
public static void main(String[] args) 
{
	for (int i = 1; i < 10; i++) 
	{
		int n=1;
		for (int j = 1; j < 10; j++) 
		{
			if(i+j>=10)
				System.out.print(n++ +" ");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
