package com.sapient.shapes;

import java.util.Scanner;

public class Circle extends Shape
{
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Circle cr= new Circle();
		int radius;
		Scanner sc = new Scanner(System.in);
		radius = sc.nextInt();
		cr.calculateShapeArea(radius);
		sc.close();
		 
		
		
	}
	public void calculateShapeArea(int radius)
	{
		double area = (double)3.14*radius*radius;
		System.out.println("Area of the Circle is "+area);
	}

}
