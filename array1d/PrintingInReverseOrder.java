package array1d;

import java.util.Scanner;

public class PrintingInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=scan.nextInt();
		int[] arr;
		arr =new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		System.out.println("array elements in reverse are =");
		for(int i=size-1;i>=0;i--)
			System.out.print(arr[i]+" ");
		scan.close();
	}

}
