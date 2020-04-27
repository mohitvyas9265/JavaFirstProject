package com.sapient.shapes;

import java.util.Scanner;

public class Triangle extends Shape
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Triangle tr= new Triangle();
		int sides;
		Scanner sc = new Scanner(System.in);
		sides = sc.nextInt();
		tr.calculateShapeArea(sides);
		sc.close();		
	}
	public void calculateShapeArea(int sides)
	{
		float area = (float)( 0.433*sides*sides);
		System.out.println("Area of the Triangle is "+area);
		
	}


	

}
