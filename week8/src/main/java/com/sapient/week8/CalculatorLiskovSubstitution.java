package com.sapient.week8;

import java.util.Scanner;

public class CalculatorLiskovSubstitution 
{
	public int getInput() 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num1=sc.nextInt();
		return num1;
	}
	public char getOp() 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter op:");
		char op=sc.next().charAt(0);
		return op;
	}
	public int calculate()
	{
		int num1=getInput();
		int num2= getInput();
		char op =getOp();
		if(op=='+')
		{
			AddLiskov al=new AddLiskov();
			return al.calculate(num1, num2);
		}
		if(op=='-')
		{
			SubstractLiskov sl=new SubstractLiskov();
			return sl.calculate(num1, num2);
		}
		if(op=='*')
		{
			MultiplyLiskov ml=new MultiplyLiskov();
			return ml.calculate(num1, num2);
		}
		if(op=='/')
		{
			DivideLiskov dl=new DivideLiskov();
			return dl.calculate(num1, num2);
		}
		return 0;
				
	}

}
