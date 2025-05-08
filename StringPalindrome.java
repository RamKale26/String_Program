/*Q12. Check if a String is Palindrome
•	Description: Check if the given string is a palindrome.

•	Input: "madam"
•	Output: Palindrome

*/

import java.util.*;
public class StringPalindrome
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String :");
		String str=sc.nextLine();
		
		char [] chars=new char[str.length()];
		for(int i=0;i<str.length();i++){
			chars[i]=str.charAt(i);
		}
		boolean isPalindrome=true;
		for(int i=0;i<str.length()/2;i++){
			if(chars[i]!=chars[str.length()-1-i]){
				isPalindrome=false;
				break;
			}
		}
		if(isPalindrome)
		{
			System.out.println("Palindrome String");
		}
		else{
			System.out.println("Not Palindrom String ");
		}
	}
}