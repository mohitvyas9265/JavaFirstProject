package com.sapient.week3;

import java.util.Arrays;
import java.util.Scanner;

public class Command_Line2 
{
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		 int arr[]=new int[n];
		 int temp;
		for(int i=0;i<n;i++)
		{
			temp=sc.nextInt();
			arr[i]=temp;
		}
		sc.close();
	}
	public void display(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public void sort(int [] arr)
	{
		Arrays.sort(arr);
	}
	public boolean find(int [] arr,int n)
	{
		 sort(arr);
		 int a =  Arrays.binarySearch(arr, n);
			if(a > 0)
				return true;
			else
				return false;

	}
	

};
