/*
A    
BB   
CCC  
DDDD 
EEEEE
DDDD 
CCC  
BB   
A 
 */
package com.hefshine.pattern;

public class Pattern27 {

	public static void main(String[] args) {
		char c='A';
		for (int i = 0; i < 9; i++) 
		{
			//int z=i;
			for (int j = 0; j < 5; j++) 
			{
				
				if (j-i<=0 && i+j<=8) 
				{
					System.out.print((char)(i+65));
				} else 
				{	
					System.out.print(" ");
				}
			}
			if(i<=9/2-1)
				c++;
			else
				c--;
			System.out.println();
			//c++;
		}
	}
}
/*
	j								
i	0	1	2	3	4	5	6	7	8
	1	A							
	2	B	B						
	3	C	C	C				j-i<=0	
	4	D	D	D	D				
	5	E	E	E	E	E			
	6	D	D	D	D				
	7	C	C	C				i+j<=8	
	8	B	B						
	9	A							
	10								

*/