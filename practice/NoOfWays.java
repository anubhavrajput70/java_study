package Study;
import java.util.*;
public class NoOfWays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int a=sc.nextInt();
		System.out.println("enter the number of colums");
		int b=sc.nextInt();
		sc.close();
		System.out.println("number of ways are = "+ways(a,b));
	}
	static int ways(int n,int m)
	{
		if(n==1||m==1)
			return 1;
		return ways(n-1,m)+ways(n,m-1);
	}
}
