package ifElse;
import java.util.*;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the a number=\n");
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		sc.close();
	}
}
