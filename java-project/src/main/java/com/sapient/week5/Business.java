package com.sapient.week5;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Business 
{
	
	int n;
	Scanner sc=new Scanner(System.in);
	Student[] st;
	Business()
	{
		
		n=sc.nextInt();
		st=new Student[n];
		for(int i=0;i<n;i++)
		{
			st[i]=new Student();
		}
		
	}
	public void read()
	{
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Id");
			int id=sc.nextInt();
			System.out.print("name");
			String name=sc.next();
			System.out.print("city");
			String city=sc.next();
			st[i].setId(id);
			st[i].setName(name);
			st[i].setCity(city);
		}
		sc.close();
	}
	public void display()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(st[i].getCity());
			System.out.println(st[i].getId());
			System.out.println(st[i].getName());
		}
	}
	public void display(int id)
	{
		
		for(int i=0;i<n;i++)
		{
			if(st[i].getId()==id)
			{
				System.out.println(st[i].getId()+" "+st[i].getName()+" "+st[i].getCity());	
				return;
			}		
			
		}
			System.out.println("User not found ");
	}
	public void display(String city)
	{
		for(int i=0;i<n;i++)
		{
			if(st[i].getCity().equals(city))
			{
				System.out.println(st[i].getId()+" "+st[i].getName()+" "+st[i].getCity());				
			}
		}
	}
	public void displayNameSorted() throws IOException
	{
		List <Student> list = new ArrayList<>(Arrays.asList(st));
		Collections.sort(list,(l, r) -> l.getName().compareTo(r.getName()));
		display();
		
	}
	public void displayCitySorted() throws IOException
	{
		List <Student> list = new ArrayList<>(Arrays.asList(st));
		Collections.sort(list,(l, r) -> l.getCity().compareTo(r.getCity()));
		display();
		
	}
	public static void main(String[] args) throws IOException 
	{
		Business b=new Business();
		b.read(); 
		b.display();
		b.display("d");
		b.displayCitySorted();
		b.displayNameSorted();
	}
	
	

}
