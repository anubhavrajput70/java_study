package Study;

import java.util.Scanner;

public class AlternateSum {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.close();
	int temp=0;
	int count=1;
	int evenSum=0;
	int oddSum=0;
	while(n!=0)
	{
		temp=n%10;
		if(count%2==0)
			oddSum+=temp;
		else
			evenSum+=temp;
		n=n/10;
		count++;
	}
	if(evenSum==oddSum)
		System.out.println("sum is equal");
	else
		System.out.println("sum is not equal");
}
}
