/*Q8. Java String Program to Remove Leading Zeros
Input: 000012356098
Output: 12356098 */

import java.util.*;
public class RemoveLeadingZero
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=s.charAt(i);
		}
		int count=0;
			
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='0')
			{
				count++;
			}
			else
			{
				break;
			}
		}
			char temp[]=new char[ch.length-count];
			for(int i=0;i<temp.length;i++)
			{
				temp[i]=ch[i + count];
				System.out.print(temp[i]+"");
			}
		}
	}

