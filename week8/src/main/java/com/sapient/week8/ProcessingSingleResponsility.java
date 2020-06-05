package com.sapient.week8;

public class ProcessingSingleResponsility 
{
	public int calculate(int num1,int num2,char op)
	{
		if(op=='+')
			return (num1+num2);
		if(op=='-')
			return (num1-num2);
		if(op=='*')
			return( num1/num2);
		if(op=='/')
		{
			try {
			if(num2==0)
				throw new Exception("Invalid input");
			else
			return (num1/num2);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		return 0;
		
	}

}
