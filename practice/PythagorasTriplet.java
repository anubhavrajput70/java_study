package Study;
import java.util.*;
public class PythagorasTriplet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any three number to check pythagoras triplet");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		int max=a;
		if(b>=max)
			max=b;
		if(c>=max)
			max=c;
		if(max==a)
		{
			boolean flag=((b*b+c*c)==(a*a));
			System.out.println(flag);
		}else if(max==c)
		{
			boolean flag=((b*b+a*a)==(c*c));
			System.out.println(flag);
		}else if(max==b)
		{
			boolean flag=((c*c+a*a)==(b*b));
			System.out.println(flag);
		}
			
		
		// TODO Auto-generated method stub
		
	}

}

