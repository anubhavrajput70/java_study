package Study;

public class FastPower1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fastPower1(232432432,5,1000000000));

	}
	static long fastPower1(long a,long b,int n)
	{
		long res=1;
		while(b>0)
		{
			if((b&1)!=0)
			{
				res=(res*a%n)%n;
			}
			a=(a%n*a%n)%n;
			b=b>>1;
		}
		return res;
	}

}
