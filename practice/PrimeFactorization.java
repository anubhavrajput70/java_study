package Study;

public class PrimeFactorization {
	public static void main(String[] args)
	{
	int n=348;
	for(int div=2;div*div<=n;div++)
	{
		while(n%div==0)
		{
		n=n/div;
		System.out.println(div+" ");
		}
	}
	if(n!=0)
		System.out.println(n);
	}
}
