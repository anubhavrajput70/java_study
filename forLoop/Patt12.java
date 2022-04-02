package forLoop;
import java.util.Scanner;
public class Patt12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int i,j;

	    for(i=1;i<=n;i++)
	    {
	        for(j=1;j<=i;j++)
	        {
	        	System.out.print(" "+j);
	        }
	       for(int k=i;k<=n*2-i-1;k++)
	       {
	    	   System.out.print(" "+i);
	       }
	       for(int l=i-1;l>=1;l--)
	       {
	    	   System.out.print(" "+l);
	       }
	        System.out.println();
	    }
	    for(i=n-1;i>=1;i--)
	    {
	        for(j=1;j<=i;j++)
	        {
	        	System.out.print(" "+j);
	        }
	       for(int k=i;k<=n*2-i-1;k++)
	       {
	    	   System.out.print(" "+i);
	       }
	       for(int l=i-1;l>=1;l--)
	       {
	    	   System.out.print(" "+l);
	       }
	        System.out.println();
	    }
	}
}
