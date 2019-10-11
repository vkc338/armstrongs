package com.cjc.app.armstrongs;

import java.util.Scanner;

public class CheckArmstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		
		int p,r,m=0;
		p=n;
		
		while(n>0)
		{
			r=n%10;
			m+=r*r*r;
			n=n/10;
		}
		if(m==p)
		{
			System.out.println("its an Armstrong number");
		}
		else {
			System.out.println("Not an Armstrong number");
		}
	}

}
