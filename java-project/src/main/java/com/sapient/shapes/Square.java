package com.sapient.shapes;

import java.util.Scanner;

public class Square extends Shape
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Square sq= new Square();
		int sides;
		Scanner sc = new Scanner(System.in);
		sides = sc.nextInt();
		sq.calculateShapeArea(sides);
		sc.close();		
	}
	public void calculateShapeArea(int sides)
	{
		double area = (double)(sides*sides);
		System.out.println("Area of the Square is "+area);
	}


}
