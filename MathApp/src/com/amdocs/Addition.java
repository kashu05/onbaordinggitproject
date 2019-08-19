package com.amdocs;

import java.util.Scanner;

public class Addition {
	
	public int add(int x,int y)
	{
		return x+y;
	}
		
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		Addition add=new Addition();
		int c=add.add(a, b);
		
		
		System.out.println("Result is:" + c);
		sc.close();
	}

}
