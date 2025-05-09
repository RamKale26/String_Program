/*Q1. WAP to input string and extract digit from it and calculate its addition?
Input: abc123mno456pqr
Output: 1+2+3+4+5+6 = 21
*/


import java.util.*;
public class Q1
{
	public static void main(String x[])
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String s = sc.nextLine();
		
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>=48&&ch<=57)
			{
				sum=sum+((int)ch-48);
				System.out.print((int)ch-48);
			}
		}
		System.out.println();
		System.out.println("Sum is :"+sum);
	}
}