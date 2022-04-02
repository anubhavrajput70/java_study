package Study;
import java.util.*;
public class BenjaminBulbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check how many bulbs are on");
		//all perfect square numbers have odd number of factors
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i*i<=n;i++)
		{
			System.out.println(i*i);
		}
		

	}

}
