package whileLoop;
import java.util.*;
public class AllEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int i=0;
		while(i<=n)
		{
			if(i%2==0)
			System.out.println(i);
			i=i+1;
		}
		sc.close();
	}

}
