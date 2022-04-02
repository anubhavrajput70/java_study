  package forLoop;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number for factorial");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		a=a*i;	
		}
		System.out.println("the factorial is"+a);
		sc.close();
	}

}

