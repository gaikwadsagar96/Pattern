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
public class Pattern58 
{

	public static void main(String[] args) 
	{
		for (int i = 0; i < 9; i++)
		{
			for (int j = 1; j < 6; j++)
			{
				if(i+j<=5 || j-i<=-3)
				{
					System.out.print(j);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
/*
0	1	2	3	4	5	6	7	8	
0	1	2	3	4	5					i+j <=4
1	1	2	3	4						
2	1	2	3							
3	1	2								
4	1									
5	1	2								j-I <=-4
6	1	2	3							
7	1	2	3	4						
8	1	2	3	4	5					
*/
