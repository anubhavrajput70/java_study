package forLoop;

public class Patt24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=9;i++)
		{
			if(i<=5)
			{
			for(int l=4;l>=i;l++)
			{
				System.out.print("  " );
			}
			for(int k=1;k<=i;k++)
			{	
					System.out.print(" *");
			}}else
			{
			for(int j=9;j>=i;j--)
			{
						System.out.print(" *");
			}}
			System.out.println();
		}
		}
	}


