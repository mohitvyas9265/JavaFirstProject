package com.sapient.week4;

import java.util.Arrays;
import java.util.Scanner;

import com.sapient.week3.num2word;

public class Int_Arr_Process
{
	int arr[];
	public Int_Arr_Process(int n)
	{
		arr=new int[n];
	}
	public Int_Arr_Process()
	{
		arr=new int[10];
	}
	public Int_Arr_Process(int arr1[])
	{
		arr=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr[i]=arr1[i];
		}
	}
	public Int_Arr_Process(Int_Arr_Process obj)
	{
		arr=obj.arr;
		
	}
	public void readArray()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		sc.close();
	}
	public void display()
	{
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+ " ");
	}
	public void sort()
	{
		Arrays.sort(arr);
	}
	public void minMax()
	{
		int max=0,min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Max is "+max+ " Min is "+min);
	}
	public void sum()
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			sum+=arr[i];
		}
		System.out.println("Sum is "+sum);		
	}
	public void secondBiggest()
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		int temp=0;		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>temp&&arr[i]!=max)
				temp=arr[i];			
		}
		System.out.println("Second biggest is "+temp);	
	}
	public static void main(String [] args)
	{
		Int_Arr_Process obj=new Int_Arr_Process(5);
		obj.readArray();
		obj.minMax();		
		obj.secondBiggest();
		obj.sort();
		obj.display();
		
	}
}
