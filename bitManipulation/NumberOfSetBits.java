
package bitManipulation;
import java.util.Scanner;
public class NumberOfSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number =");
		int n=sc.nextInt();
		sc.close();
		int count=0;
		while(n!=0)
		{
			n=n&(n-1);
			count++;
		}
		System.out.println("there are "+count+" set bits in the number");
		
	}

}
