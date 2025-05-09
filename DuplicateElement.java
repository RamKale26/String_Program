import java.util.*;
public class DuplicateElement
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str=sc.nextLine();
		
			
		for(int i=0;i<str.length();i++)
		{
			char c =str.charAt(i);
			int count=0;
			boolean isDuplicate=false; 
		
		for(int j=0;j<i;j++)
		{
			if(str.charAt(j)==c)
			{
				isDuplicate=true;
				break;
			}
		}
		if(!isDuplicate)
		{
			for(int k=0;k<str.length();k++)
			{
				if(str.charAt(k)==c)
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println("Duplicate element is :" +c +"\nCount : "+count);
			}
		}
	}
  }
}