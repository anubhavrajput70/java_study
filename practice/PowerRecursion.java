package Study;

public class PowerRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(recursivePower(3,3));

	}
	static int recursivePower(int n, int e)
	{
		int res=1;
		if(e==0)
			return 1;
		res=n*recursivePower(n,e-1);
		return res;
		
		
	}

}
