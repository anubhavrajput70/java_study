package Study;
import java.util.*;
public class PrimeRangeSum {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the range ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	sc.close();
	int temp=0;
	int sum=0;
	for(int i=a;i<=b;i++)
	{
		for(int j=2;j<=i-1;j++)
		{
			if(i%j==0)
				temp++;
		}
		if(temp==0)
			sum=sum+i;
		else
			temp=0;
	}
	System.out.println(sum);
}
}
