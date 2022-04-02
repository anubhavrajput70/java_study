package bitManipulation;
import java.util.Scanner;
public class BitwiseEvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number = ");
		int n=sc.nextInt();
		sc.close();
		if((n&1)==1)
			System.out.println("number is odd");
		else
			System.out.println("number is even");
	}

}
