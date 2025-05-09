/*Q2. WAP to input string and calculate the vowel,consonant and special symbols in string?*/

import java.util.*;
public class Q2
{	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :");
		String s=sc.nextLine();
		int vowel=0,consonant=0,specialS=0,digits=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'|ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U') {
				vowel++;
			}
			else if(ch>='a' && ch<='z')
			{
				consonant++;
			}
			else if((ch>='0' && ch<='9') && ch !=' ') //(!(ch>='0' && ch<='9') && ch !=' ') 
			{	
												//specialS++;
				digits++;
				
				
			}
			else{
				specialS++;           //blanks
			}
		}
	System.out.println("Vowels :"+vowel);
	System.out.println("consonant :"+consonant);
	System.out.println("specialS :"+specialS);
	System.out.println("Digits :"+digits);		
 }
}