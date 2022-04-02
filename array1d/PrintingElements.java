package array1d;
import java.util.Scanner;
public class PrintingElements {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[];
	System.out.println("enter the size of the array");
	int n=scan.nextInt();
	arr=new int[n];
	System.out.println("enter array elements");
	for(int i=0;i<n;i++)
	{
		arr[i]=scan.nextInt();
	}
	scan.close();
	System.out.println("array elements are = ");
	for(int i=0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
}
}
