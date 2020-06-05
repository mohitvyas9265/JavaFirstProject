package com.sapient.week8;

public class DivideLiskov implements ProcessingLiskov
{
	public int calculate(int num1,int num2)
	{
		try {
			if(num2==0)
				throw new Exception("Invalid input");
			else
			return num1/num2;
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				return 0;
			}
	}
}
