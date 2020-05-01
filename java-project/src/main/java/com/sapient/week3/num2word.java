package com.sapient.week3;

public class num2word 
{
		public static final String[] units = { "", "One", "Two", "Three", "Four",
				"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
				"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
				"Eighteen", "Nineteen" };

		public static final String[] tens = { 
				"", 		// 0
				"",		 	// 1
				"Twenty", 	// 2
				"Thirty", 	// 3
				"Forty", 	// 4
				"Fifty", 	// 5
				"Sixty", 	// 6
				"Seventy",	// 7
				"Eighty", 	// 8
				"Ninety" 	// 9
		};
		public static final String[] others = {
				"hunderd",
				"thousand",
				"lakh"
		};

		public static String fig_to_words(long n) 
		{
			
			String words = "";
			if(n < 100) 
			{
				words = (n%10 == 0) ? tens[(int)n/10] :  tens[(int)n/10] +" "+units[(int)n%10];
			}else if(n < 1000)
			{
				words = (n%100 == 0) ? (units[(int) (n/100)] +" "+others[0]) : (units[(int) (n/100)] +" "+others[0]+" ")+fig_to_words (n%100);
			}else if(n < 10000) 
			{
				words = (n%1000 == 0) ? (units[(int) (n/1000)] +" "+others[1]) : (units[(int) (n/1000)] +" "+others[1] +" ")+fig_to_words (n%1000);
			}else if(n < 100000)
			{
				words = (n%1000 == 0) ? (fig_to_words (n/1000) +" "+others[1]+" ")+fig_to_words(n%1000):(fig_to_words(n/1000) +" "+others[1]+" ")+fig_to_words(n%1000);
			}else
			{
				words = (n%100000 == 0) ? (fig_to_words (n/100000) +" "+others[2]) : (fig_to_words (n/100000) +" "+others[2]+" ")+fig_to_words (n%100000);
			}
			return words;
		}


}