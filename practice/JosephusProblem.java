package Study;
import java.util.*;
public class JosephusProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of persons");
		int a=sc.nextInt();
		System.out.println("enter the gap for shoot");
		int b=sc.nextInt();
		sc.close();
		System.out.println(josephus(a,b));
	}
	static int josephus(int n,int k)
	{
		if(n==1)
			return 0;
		return (josephus(n-1,k)+k)%n;
	}

}
