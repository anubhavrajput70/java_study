package Study;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
	Scanner dc=new Scanner(System.in);
	System.out.println("enter the no. of element of fibonacci series to print");
	int n=dc.nextInt();
	dc.close();
	int a=0,b=1,c;
	System.out.println(a+"\n"+b);
	for(int i=3;i<=n;i++)
	{
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	}
	}
}
