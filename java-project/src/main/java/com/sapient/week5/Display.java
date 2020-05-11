package com.sapient.week5;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;



public class Display 
{
	public static void main(String[] args)
	{
		String filePath;
		try 
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter file path: ");
			filePath=sc.nextLine();
			File file=new File(filePath);
			if(file.exists())
			{
				if(file.isDirectory())
				{
					String[] st;
					st=file.list();
					System.out.println(Arrays.toString(st));
					
				}
			}
			
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("File not found");
		}
	}

}
