package com.sapient.shapes;

import java.util.Scanner;

public class Shapes {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int numberOfSides,length;
//test case 1
		numberOfSides = 3;
		length=12;
		Shapes sh = new Shapes();
		sh.calculateShapeArea(numberOfSides, length);
//test case 2
		numberOfSides = 4;
		length=15;
		sh.calculateShapeArea(numberOfSides, length);	
//test case 3
		numberOfSides = 5;
		length=15;
		sh.calculateShapeArea(numberOfSides, length);	
		

	}
	public void calculateShapeArea(int numberOfSides,int length)
	{
		switch (numberOfSides) {
		case 1:
			Circle cr = new Circle();
			cr.calculateShapeArea(length);
			break;
		case 3:
			Triangle tr = new Triangle();
			tr.calculateShapeArea(length);
			break;
		case 4:
			Square sq= new Square();
			sq.calculateShapeArea(length);
			break;
		default:
			System.out.println("No Shapes Present");
			break;
		}
		
	}

}
