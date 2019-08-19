package com.amdocs;

import java.util.Scanner;

public class Main {
	
	public static void displaymenu()
	{
		System.out.println("Main Menu");
		System.out.println("Quick Sort");
		System.out.println("Bubble Sort");
		System.out.println("Heap Sort");
		System.out.println("Exit");
		
	}
	
	public static int getChoice()
	{
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		
		return sc.nextInt();
	}
	
	
	public static void doWork(int choice)
	{
		IAlgorithm algo = AlgorithmFactory.getAlgo(choice);
		algo.sort();
	}

	public static void main(String[] args) 
	{
		int choice=0;
		while(choice != 4)
		{
			displaymenu();
			choice=getChoice();
			
			if (choice!=4)
				doWork(choice);
		}
		
		System.out.println("Application exited Successfuly");
	}

}
