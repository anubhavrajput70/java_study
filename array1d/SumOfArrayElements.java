package array1d;
import java.util.Scanner;
public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the size of array");
		int size=scan.nextInt();
		int[] arr;
		arr =new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		for(int i=0;i<size;i++)		
		    sum=sum+arr[i];
		System.out.println("sum of array elements is = "+sum);
		scan.close();
	}

}
