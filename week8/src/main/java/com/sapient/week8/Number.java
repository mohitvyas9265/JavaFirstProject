package com.sapient.week8;

/**
 * Hello world!
 *
 */
public class Number 
{
	public int checkPrime(int x)
	{
		for(int i=2;i<=x/2;i++)
		{
			if(x%2==0)
				return 1;
		}
		return 0;
		
	}
	public Boolean checkPalindrome(int x)
	{
		String o=String.valueOf(x);
		String r="";
		 for ( int i = o.length() - 1; i >= 0; i-- )  
	         r = r + o.charAt(i);  
	      if (o.equals(r))  
	         return true; 
	      else  
	         return false;    
		
	}
	public Boolean checkAmstrong(int x)
	{
		int a,b=x;
		int comp=0;
		while(x>0)
		{
			a=x%10;
			x=x/10;
			comp+=a*a*a;
		}
		if(b==comp)
			return true;
		else 
			return false;
			
			
		
	}
    public static void main( String[] args )
    {
        Number num=new Number();
        System.out.println(num.checkPalindrome(121));
    }
}
