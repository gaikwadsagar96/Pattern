/*
12345
 1234
  123
   12
    1
   12
  123
 1234
12345
*/
package com.hefshine.pattern;

public class Pattern59 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 9; i++) 
		{
			int z=1;
			for (int j = 0; j < 5; j++) 
			{
				if(j-i>=0 || i+j>=8)
					System.out.print(z++);
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
/*
0	1	2	3	4	5	6	7	8	
0	1	2	3	4	5					j-I >=0
1		1	2	3	4					
2			1	2	3					
3				1	2					
4					1					i+j >=8
5				1	2					
6			1	2	3					
7		1	2	3	4					
8	1	2	3	4	5					
9										
*/