package com.sapient.week1;
public class CheckEven
 {

    public static void main (String[] args) 
    {
		System.out.println ("Inside main function");
		int arr[]= {1,2,3,4};
		int arr1[]=arr;
		arr=new int[5];
		for(int i=0;i<arr1.length;i++)
			arr[i]=arr1[i];
		System.out.println(arr[4]);
		
		
    }
     public Boolean check(int n)
	{
	if(n%2==0)
		return true;
	else
		return false;
	}   
	  

}