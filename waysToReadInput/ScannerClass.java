package waysToReadInput;
import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String str=sc.nextLine();
		System.out.println(str);
		sc.close();
	}
}
