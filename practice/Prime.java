package Study;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check prime=");
		int n=sc.nextInt();
		int flag=0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				flag=flag+1;
			}
		}
		if(flag==0)
			System.out.println("prime");
		else
			System.out.println("not prime");
		sc.close();
	}

}
