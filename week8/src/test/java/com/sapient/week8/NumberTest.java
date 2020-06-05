package com.sapient.week8;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;

public class NumberTest 
{
	Number num=null;	
	@Before
	public void initial() 
	{
		num = new Number();
	}
	
	@Test
	public void Testcase1() throws Exception 
	{		
		int input = 23;
		int expected=1;
		int actual = num.checkPrime(input);
		assertEquals(expected, actual);		
	}
	@Test
	public void Testcase2() throws Exception 
	{		
		int input = 20;
		int expected=0;
		int actual = num.checkPrime(input);
		assertEquals(expected, actual);		
	}
	@Test
	public void Testcase3() throws Exception
	{		
		int input = 0;
		int expected=0;
		int actual = num.checkPrime(input);
		assertEquals(expected, actual);		
	}
	@Test
	public void Testcase4() throws Exception 
	{		
		int input = -2;
		int expected=0;
		int actual = num.checkPrime(input);
		assertEquals(expected, actual);		
	}
	@Test
	public void Testcase5() throws Exception 
	{		
		int input = 121;
		boolean expected=true;
		boolean actual = num.checkPalindrome(input);
		assertEquals(expected, actual);		
	}
	@Test
	public void Testcase6() throws Exception 
	{		
		int input = 10;
		boolean expected=false;
		boolean actual = num.checkPalindrome(input);
		assertEquals(expected, actual);		
	}
	@Test
	public void Testcase7() throws Exception 
	{		
		int input = 0;
		boolean expected=true;
		boolean actual = num.checkPalindrome(input);
		assertEquals(expected, actual);		
	}
	@Test
	public void Testcase8() throws Exception 
	{		
		int input = -1;
		boolean expected=false;
		boolean actual = num.checkPalindrome(input);
		assertEquals(expected, actual);		
	}
	@Test
	public void Testcase10() throws Exception 
	{		
		int input = 134;
		boolean expected=false;
		boolean actual = num.checkAmstrong(input);
		assertEquals(expected, actual);		
	}
	@Test
	public void Testcase11() throws Exception 
	{		
		int input = 1;
		boolean expected=true;
		boolean actual = num.checkAmstrong(input);
		assertEquals(expected, actual);		
	}
	@Test
	public void Testcase12() throws Exception 
	{		
		int input = -3;
		boolean expected=false;
		boolean actual = num.checkAmstrong(input);
		assertEquals(expected, actual);		
	}


	

}
