package com.sapient.week4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
interface Num_Process
{
    abstract int cal(int a, int b);
}
public class Main
{
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		char ch= sc.next().charAt(0);
		sc.close();
		Map<String,Integer> hm = new HashMap<String,Integer>();
		Num_Process add= (a,b)->{return a+b;};
		Num_Process sub= (a,b)->{return a-b;};
		Num_Process divide= (a,b)->{if(b!=0) return a/b; else return 0;};
		Num_Process multiply= (a,b)->{return a*b;};
		hm.put("+",add.cal(x,y));
		hm.put("*",multiply.cal(x,y));
		hm.put("/",divide.cal(x,y));
		hm.put("-",sub.cal(x,y));
		System.out.println(hm.get((ch)));
	
	}
}