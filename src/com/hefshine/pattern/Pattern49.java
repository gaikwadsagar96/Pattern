/*
        1
       12
      123
     1234
    12345
   123456
  1234567
 12345678
123456789
*/
package com.hefshine.pattern;
public class Pattern49 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 9; i++) 
		{
			int n=1;
			for (int j = 0; j < 9; j++) 
			{
				if(i+j>=8)
					System.out.print(n++);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
