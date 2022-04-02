package ifElse;
import java.util.*;
public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any three number =");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is greatest no.");
			}
			else
			{
				System.out.println(c+" is greatest no.");
			}
		}
		else
		{
			if(b<c)
			{
				System.out.println(c+" is greatest no.");
			}
			else
			{
				System.out.println(b+" is greatest no.");
			}
		}
		sc.close();
	}

}
