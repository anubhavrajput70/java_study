package forLoop;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==j)
					System.out.print(1);
				else
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
