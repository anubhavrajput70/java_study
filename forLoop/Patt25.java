package forLoop;

public class Patt25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=7;i++)
		{
			for(int k=7;k>=i-1;k--)
			{
				if(k%2==0)
				System.out.print("  ");
				else
					System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
		
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
