package forLoop;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,a=1,sum=0,m,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many digit in number=");
		int x=sc.nextInt();
		System.out.println("enter a number=");
		int n=sc.nextInt();
		b=n;
		for(i=n;i!=0;)
		{
		m=n%10;	
		n=n/10;
		for(i=1;i<=x;i++)
		{
			a=a*m;
		}
		sum=sum+a;
		a=1;
		i=n;																																		
		}
		n=b;
		System.out.println("the number is="+sum);
		if(n==sum)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
			

	}

}
