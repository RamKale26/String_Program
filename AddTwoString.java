
import java.util.*;
public class Q11
{	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String :");
		String F=sc.nextLine();
		System.out.println("Enter Second String :");
		String S=sc.nextLine();
		
		long S1=Long.parseLong(F);
		long S2=Long.parseLong(S);
		
		System.out.println("ADDISTION IS :"+(S1+S2));
	}
}