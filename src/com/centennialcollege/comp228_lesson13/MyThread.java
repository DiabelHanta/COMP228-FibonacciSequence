package com.centennialcollege.comp228_lesson13;

public class MyThread extends Thread 
{
	//PRIVATE INSTANCE VARIABLES
	private String _name;
	
	//Constructor for Thread
	public MyThread(String name)
	{
		this._name = name;
	}
	
	@Override
	public void run()
	{
		for(int index = 0; index < 10; index++)
		{
			System.out.println("Thread" + this._name + "Count: " + index);
			try
			{
				sleep(1000);
			}
			catch(InterruptedException exception)
			{
				System.err.println("Thread Interrupted: " + exception);
			}
		}
		
		super.run();
	}
}
