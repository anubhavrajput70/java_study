package array1d;
import java.util.*;
public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a range to print prime");
		int a=sc.nextInt();
		sc.close();
		boolean[] isPrime=sieveOfEratosthenes(a);
		for(int i=0;i<a;i++)
			if(isPrime[i])
			 System.out.println(i+" ");
	}
	static boolean[] sieveOfEratosthenes(int n)
	{
		boolean[] isPrime=new boolean[n+1];
		Arrays.fill(isPrime,true);
		isPrime[0]=false;
		isPrime[1]=false;
		for(int i=2;i*i<=n;i++)
		{
			for(int j=2*i;j<=n;j+=i)
				isPrime[j]=false;
		}
		
		return isPrime;
		
	}

}
