package forLoop;
import java.util.*;
public class AllOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter any number where you want to print the odd number");
		n=scan.nextInt();
		for(i=1;i<=n;i++)
		{
		System.out.println(i);
		i=i+1;
		}
		scan.close();
	}
}
