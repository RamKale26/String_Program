/*Q7. Java String Program to Replace a Character at a Specific Index
Input: str = "JAVA IS FOOD Programming " , index = 8 , ch = 'G'
Output: "JAVA IS GOOD Programming"
*/

import java.util.*;
public class ReplaceCharacter
{
	public static void main(String x[])
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :");
		String s=sc.nextLine();
		
		System.out.println("Enter new Character :");
		String n=sc.nextLine();
		
		System.out.println("Where new Character Place pls enter Index :");
		int no=sc.nextInt();
		String result="";
		
		if(no>=s.length() || no<=0)
		{
			System.out.println("Invalid Output :");
		}
		else 
		{
			for(int i=0;i<s.length();i++)
			{
				if(i==no)
				{
					result=result+n;
				}
				else{
					result=result+s.charAt(i);
				}
			}
		}
		System.out.println(result);
	}
}