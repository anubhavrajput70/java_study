package forLoop;

public class Patt15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=3;i>=1;i--)
		{
			for(int k=i;k<=3;k++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i*2-1;j++)
			{	
				if(j==1||j==5||(j==3&&i==2))
				System.out.print(" #");
				else
					System.out.print("  " );
			}
			System.out.println();
	       }
		for(int i=2;i<=3;i++)
		{
			for(int k=i;k<=3;k++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i*2-1;j++)
			{	
				if(j==1||(i==2&&j==3)||j==5)
				System.out.print(" #");
				else
					System.out.print("  " );
			}
			System.out.println();

	}
	}
}
