package com.hefshine.ExtraPattern;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < 12; i++) 
		{
			for (int j = 1; j < 7;j++) 
			{
				if(j-i<=0 || i+j>=12)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
