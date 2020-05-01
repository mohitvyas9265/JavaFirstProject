package com.sapient.week4;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix 
{
	int arr[][];
	public Matrix(int m,int n)
	{
		arr=new int[m][n];
	}
	public Matrix()
	{
		arr=new int[3][3];
	}
	public Matrix(int arr1[][])
	{
		arr=new int[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
				arr[i][j]=arr1[i][j];
		}
	}
	public Matrix(Matrix obj)
	{
		arr=obj.arr;
		
	}
	public void readMatrix()
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		arr=new int[m][n];		
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
			arr[i][j]=sc.nextInt();
	}
	public void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println("");
		}		
	}
	public int[][] add(int arr1[][])
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
				arr[i][j]+=arr1[i][j];
		}
		return arr;
	}
	public void scalar()
	{
		int result=arr[0][0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				result=gcd(result,arr[i][j]);
			}
		}
		if(result!=1)
			System.out.println(" Matrix is Scalar ");
		else
			System.out.println(" Matrix is not Scalar ");
	}
	public int gcd(int a, int b) 
	{ 
	    if (a == 0) 
	        return b; 
	    return gcd(b % a, a); 
	}
	public int[][] multiply(int arr1[][])
	{
		int arr2[][] = new int[arr.length][arr1[0].length];
		for(int i = 0; i < arr.length; i++) 
		{
            for (int j = 0; j < arr1[0].length; j++) 
            {
                for (int k = 0; k < arr[0].length; k++) 
                {
                    arr2[i][j] += arr[i][k] * arr1[k][j];
                }
            }
        }
		return arr2;
	}		

}

