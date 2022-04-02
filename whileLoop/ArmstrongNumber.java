package whileLoop;
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to check armstrong =");
		int n=sc.nextInt();
		System.out.println("enter the size of the digit");
		int m=sc.nextInt();
		int o=0,sum=0,mul=1;
		int b=0,c=0;
		b=n;
		c=m;
		while(n!=0)
		{
			o=n%10;
			n=n/10;
			while(m>=1)
			{
				mul=mul*o;
				m--;
			}
			sum=sum+mul;
			m=c;
			mul=1;
		}
		if(sum==b)
		System.out.println("armstrong number");
		else
		System.out.println("not a armstrong number");
		sc.close();
	}
}
