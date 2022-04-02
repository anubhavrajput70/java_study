package whileLoop;
import java.util.Scanner;
public class TableOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to print its table=");
		int n=sc.nextInt();
		int i=1;
				while(i!=11)
				{
					System.out.println(n+"*"+i+"="+i*n);
					i++;
				}
				sc.close();
	}

}
