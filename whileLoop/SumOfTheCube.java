package whileLoop;
import java.util.Scanner;
public class SumOfTheCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int c=0,sum=0,m=0;
		while(n!=0)
		{
		m=n%10;
		n=n/10;
		c=m*m*m;
		sum=sum+c;
		}
		System.out.println("number is = "+sum);
		sc.close();
	}
}
