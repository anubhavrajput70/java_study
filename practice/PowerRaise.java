package Study;

public class PowerRaise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int N=4;
			int K=2;
			int a=1;
			while(K!=0)
			{
				a=a*N;
				K--;
				
			}
			int b=a%10;
			System.out.println(b);
	}

}
