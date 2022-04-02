package whileLoop;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to know its facorial= ");
		int n=sc.nextInt();
		int i=1,fact=1;
		while(n!=i)
		{
			fact=fact*n;
			n--;
		}
		System.out.println("factorial is = "+fact);
		sc.close();
	}

}
