/*
*    **********    *
**   ****  ****   **
***  ***    ***  ***
**** **      ** ****
******        ******
*/
package com.hefshine.pattern;
public class Pattern78 
{

	public static void main(String[] args) throws InterruptedException 
	{
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 20; j++) 
			{
				if( (j-i<=0 && j<5)||(i+j<=9 && j>4&&j<10)||(j-i>=10&& j>9&&j<15)||(i+j>=19&&j>14) )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		/*for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 20; j++) 
			{
				if((j-i<=0)&&j<=4)
				{
					Thread.sleep(300);
					System.out.print("*");
				}else if((i+j <=9) &&j>=5&&j<=9)
				{
					Thread.sleep(300);
					System.out.print("*");
				}else if((j-i>=10) && j>=10&&j<=14)
				{
					Thread.sleep(300);
					System.out.print("*");
				}
				else if((i+j>=19)&& j>=15)
					{
						Thread.sleep(300);
						System.out.print("*");
					}
				else
					System.out.print(" ");
			}
			System.out.println();
		}*/
	}
}
/*
0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19	20
0	*					*	*	*	*	*	*	*	*	*	*					*	
1	*	*				*	*	*	*			*	*	*	*				*	*	
2	*	*	*			*	*	*					*	*	*			*	*	*	
3	*	*	*	*		*	*							*	*		*	*	*	*	
4	*	*	*	*	*	*									*	*	*	*	*	*	
5		j-I< =0					i+j <=9					j-I> =10						i+j> =19			
6																					

*/

