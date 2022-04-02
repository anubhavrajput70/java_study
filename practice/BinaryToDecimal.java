package Study;
import java.util.*;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a binary number");
		int b=sc.nextInt();
		sc.close();
		int n=b;
		int mul=0;
		int a=0;
		int count=0;
		while(n!=0)
		{
			a=n%10;
			n=n/10;
			mul=mul+(int)Math.pow(2,count)*a;
			count++;
		}
		System.out.println("decimal equivalent of binary "+b+" is "+mul);
	}

}
