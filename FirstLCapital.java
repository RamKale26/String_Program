/*Q4. WAP to input string and convert every word first letter in capital?
Input: good morning india
Output: Good Morning India. */


import java.util.*;
public class FirstLCapital
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		

		for(int i=0;i<s.length();i++)
		{	
			char ch=s.charAt(i);
			if(ch==' ')
			{
				if(ch(i)>95)
				{
					char ch(i+1)=(char)((int)ch(i+1)-32);
				}
			}
			
		}
		System.out.println("result "+ch);
	}
}
	