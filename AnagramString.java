/*Q14. Check if Two Strings are Anagrams
•	Description: Check if two strings are anagrams of each other.

•	Input: "listen", "silent"

•	Output: Anagram
*/

import java.util.*;
public class AnagramString{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String :");
		String str1 = sc.nextLine();
		
		System.out.println("Enter Second String :");
		String str2 = sc.nextLine();
		
		str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Not Anagram ");
			return;
		}
		int [] s1=new int[26];
		int [] s2=new int[26];
		
		for(int i=0;i<str1.length();i++)
		{
			s1[str1.charAt(i)-'a']++;
			s2[str2.charAt(i)-'a']++;
		}
		
		for(int i=0;i<26;i++)
		{
			if(s1[i]!=s2[i])
			{
				System.out.println("Not Anagram");
				return;
			}
		}
		System.out.println("It's Anagram ");
	}
}