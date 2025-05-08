/*Q15. Replace All Occurrences of a Character in String
•	Description: Replace all occurrences of a character in a string with another character.

•	Input: "hello", o -> x

•	Output: "hellx"
*/

import java.util.*;
public class ReplaceAllCharacerts{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :");
		String str=sc.nextLine();
		
		System.out.println("Enter Where you want to Replace Character : ");
		char re=sc.next().charAt(0);
		
		System.out.println("Enter New Character Replace old Character : ");
		char n=sc.next().charAt(0);
		
		String result = str.replace(re,n);
		
		System.out.println(result);
		
	}
}