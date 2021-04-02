/*
ABCDEF
ABCDE 
ABCD  
ABC   
AB    
A     
A     
AB    
ABC   
ABCD  
ABCDE 
ABCDEF
 */
package com.hefshine.pattern;

public class Pattern29 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 12; i++) 
		{
			char z='A';
			for (int j = 0; j < 6; j++) 
			{
				if(i+j<=5 || j-i<=-6)
					System.out.print(z++);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
/*
	j							
i		0	1	2	3	4	5	6
	0	A	B	C	D	E	F	
	1	A	B	C	D	E		
	2	A	B	C	D			i+j <=5
	3	A	B	C				
	4	A	B					
	5	A						
	6	A						j-I <=-6
	7	A	B					
	8	A	B	C				
	9	A	B	C	D			
	10	A	B	C	D	E		
	11	A	B	C	D	E	F	
	12							

*/