package com.sapient.week3;
import java.util.Scanner;

public class Command_Line1 
{
	public void setData(int n)
	{
		Scanner sc=new Scanner(System.in);
		 int arr[]=new int[n];
		int temp;
		for(int i=0;i<n;i++)
		{
			temp=sc.nextInt();
			arr[i]=temp;
		}
		sc.close();
	}
	public void calData(int [] arr)
	{
		int sum=0,avg,max=0,min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
       if(arr[i]<min)
				min=arr[i];
			sum+=arr[i];
		}
		avg=sum/arr.length;
		System.out.println("Sum is "+sum+ "Avg is "+avg+"Max is "+max+"Min is "+min);
	}
	public void displayData(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
			
	}
	

	
	

}
