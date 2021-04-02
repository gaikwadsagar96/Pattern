/*
1    
12   
123  
1234 
12345
1234 
123  
12   
1  
*/
package com.hefshine.pattern;

public class Pattern55 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i < 10; i++) 
		{
			for (int j = 1; j < 6; j++) 
			{
				int z=j;
				if(j-i<=0 && i+j <=10)
					System.out.print(z++);
				else
					System.out.print(" ");
					
			}
			System.out.println();
		}
	}
}

/*1	2	3	4	5	6	7	8	9	10
1	1									
2	1	2								j-i<=0
3	1	2	3							
4	1	2	3	4						
5	1	2	3	4	5					
6	1	2	3	4						i+j <=10
7	1	2	3							
8	1	2								
9	1									
10										
*/