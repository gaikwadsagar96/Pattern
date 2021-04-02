/*
     1 
    1 2 
   1 2 3 
  1 2 3 4 
 1 2 3 4 5 
 */
package com.hefshine.pattern;

public class Pattern56 {

	public static void main(String[] args) 
	{
		/*for (int i = 0; i < 5; i++) 
		{
			int z=1;
			for (int j = 0; j < 6; j++) 
			{
				if(i+j-1>=5)
					System.out.print(z++ +" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}*/
		
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = i; j <=5; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <=i; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}


	}

}
/*
j									
0	1	2	3	4	5	6	7	8	9
1	2	3	4	5	6	7	8	9	10
0	1					1					
i	1	2				1	2					i+j >=5
2	3			1	2	3					
3	4		1	2	3	4					
4	5	1	2	3	4	5					
*/