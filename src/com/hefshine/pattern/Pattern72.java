package com.hefshine.pattern;
/*
1    
121   
12321  
1234321 
123454321
*/
public class Pattern72
{
	public static void main(String[] args) 
	{
		for (int i = 0; i <5; i++)
		{
			int n=1;
			for (int j = 0; j <5; j++) 
			{
				if(i+j>=4 )
					System.out.print(n++);
				else
					System.out.print(" ");
			}
			int no=n-2;
			for (int j = 5; j < 9; j++) 
			{
				
				if(j-i<=4)
					System.out.print(no--);
				else
					System.out.print(" ");
			}
			System.out.println();			
		}
	}
}

/*0	1	2	3	4	5	6	7	8	9
0					1					
1				1	2	1				
2			1	2	3	2	1			
3		1	2	3	4	3	2	1		
4	1	2	3	4	5	4	3	2	1	
5		i+j>=4				j-i<=4				
*/
