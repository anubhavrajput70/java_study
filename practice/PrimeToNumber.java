package Study;
import java.util.Scanner;
public class PrimeToNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number upto which you want prime no. =");
		int n=sc.nextInt();
		int flag=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					flag=flag+1;
				}
			}
			if(flag==0)
				System.out.println(i);
			else
				flag=0;
		}
		sc.close();
		
	}

}
