/*
        1 
       2 2 
      3 3 3 
     4 4 4 4 
    5 5 5 5 5 
   6 6 6 6 6 6 
  7 7 7 7 7 7 7 
 8 8 8 8 8 8 8 8 
9 9 9 9 9 9 9 9 9 
*/
package com.hefshine.pattern;

public class Pattern52 
{
	public static void main(String[] args)
	{
		for (int i = 1; i < 10; i++) 
		{
			for (int j = 1; j < 10; j++) 
			{
				if(i+j>=10)
					System.out.print(i+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
/*
1	2	3	4	5	6	7	8	9	10
1									1	i+j>=10
2								2	2	
3							3	3	3	
4						4	4	4	4	
5					5	5	5	5	5	
6				6	6	6	6	6	6	
7			7	7	7	7	7	7	7	
8		8	8	8	8	8	8	8	8	
9	9	9	9	9	9	9	9	9	9	
10										
*/
