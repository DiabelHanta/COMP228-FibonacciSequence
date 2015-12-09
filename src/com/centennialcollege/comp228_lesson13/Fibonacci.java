package com.centennialcollege.comp228_lesson13;

public class Fibonacci implements Runnable 
{
	//PRIVATE INSTANCE VARIABLES
	private int _num;

	public Fibonacci(int num)
	{
		this._num = num;
	}

	@Override
	public void run() 
	{
		Task1();
	}

	//Task contains "fibonacci sequence"
	private synchronized void Task1()
	{
		for(int num = 0; num < 10; num++)
		{
			//Implement "fibonacci sequence"
			if(num == 1 || num == 2)
			{
				System.out.println();
			}
		    else if(num == 0)
		    {
		    }
		    else
		    {
		    	return ((num - 1) + (num - 2));
		    }
		}
	}
}