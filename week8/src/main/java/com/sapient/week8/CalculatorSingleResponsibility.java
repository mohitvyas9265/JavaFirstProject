package com.sapient.week8;

import java.util.Scanner;

public class CalculatorSingleResponsibility
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
		ProcessingSingleResponsility psr=new ProcessingSingleResponsility();
		int ans=psr.calculate(num1, num2, op);
		return ans;
		
	}

}


