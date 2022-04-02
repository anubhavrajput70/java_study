package Study;

public class FastPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fastPower(3,4));
	}
	static int fastPower(int a,int b)
	{
		int res=1;
		while(b>0)
		{
			if((b&1)!=0)
			{
				res=res*a;
			}
			a=a*a;
			b=b>>1;
		}
		return res;
	}
	

}
