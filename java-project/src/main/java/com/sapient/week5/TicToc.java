package com.sapient.week5;
class Tic implements Runnable
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{	System.out.println("Tic ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void start () 
	{
	      System.out.println("Starting ");
	      /*if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }*/
	   }
}
class Toc implements Runnable
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{	System.out.print("Toc ");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void start () 
	{
	      System.out.println("Starting ");
	      /*if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }*/
	   }
}


public class TicToc 
{
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Thread t1=new Thread(new Tic());
		Thread t2=new Thread(new Toc());
		t1.start();
		t2.start();
		
		
		
	}

}
