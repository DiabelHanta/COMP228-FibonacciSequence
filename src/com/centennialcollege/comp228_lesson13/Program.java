package com.centennialcollege.comp228_lesson13;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//(extends Thread) refers to 
public class Program extends Thread
{
	public static void main(String[] args) 
	{
		//Prompting User
		System.out.println("Add a number to get sequence of the Fibonacci seqqunce:");
		
		//User's input
		int num = new Scanner(System.in).nextInt();
		
		//Fibonacci class call
		Fibonacci fibonacci = new Fibonacci(4);
		
		//Executor
		ExecutorService executor = Executors.newFixedThreadPool(1);
		
		//Execute fibonacci
		executor.execute(fibonacci);
		
		//START OUR MAIN OPERATION
		
		//Shutdown's the entire executor
		executor.shutdown();
	}
}