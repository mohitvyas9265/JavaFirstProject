package com.sapient.week8;

public class Calculator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Implementing by Single Responsibility Principle");
		CalculatorSingleResponsibility csr=new CalculatorSingleResponsibility();
		int ans=csr.calculate();
		System.out.println("Answer = "+ans);
		System.out.println("Implementing by Liskov Substitution Principle  ");
		CalculatorLiskovSubstitution cls=new CalculatorLiskovSubstitution();
		ans=cls.calculate();	
		System.out.println("Answer = "+ans);

	}

}
