package whileLoop;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number to reverse =");
			int n=sc.nextInt();
			int m=0,rev=0;
			while(n!=0)
			{
				m=n%10;
				n=n/10;
				rev=(rev*10)+m;
			}
			System.out.println("reverse = "+rev);
			sc.close();
	}

}
