package forLoop;
public class Patt11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(" #");
			}
			for(int k=1;k<=i-1;k++)
			{
				System.out.print("  ");
			}
			for(int m=1;m<=i-1;m++)
			{
				System.out.print("  ");
			}
			for(int l=i;l<=5;l++)
			{
				System.out.print(" #");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" #");
			}
			for(int k=i;k<=4;k++)
			{
				System.out.print("  ");
			}
			for(int m=i;m<=4;m++)
			{
				System.out.print("  ");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print(" #");
			}
			System.out.println();
		}
	}
}
/*
output
 # # # # # # # # # #
 # # # #     # # # #
 # # #         # # #
 # #             # #
 #                 #
 #                 #
 # #             # #
 # # #         # # #
 # # # #     # # # #
 # # # # # # # # # #
*/