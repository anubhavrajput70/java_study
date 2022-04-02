package Study;
import java.util.*;
public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number = ");
		int n=sc.nextInt();
		sc.close();
		int a=n,b=0;
		String s="";
		while(a!=0)
		{
			b=a%2;
			a=a/2;
			s=b+s;
		}
		System.out.println("binary number for the "+n+" is "+s);
	}
}
