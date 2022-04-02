package array2d;
import java.util.Scanner;
public class PrintingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[][] arr;
		System.out.println("enter the row and column of the array");
		int r=s.nextInt();
		int c=s.nextInt();
		arr=new int[r][c];
		System.out.print("enter the elements of array");
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
				arr[i][j]=s.nextInt();
				}
			}
		System.out.println("array elements are =");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
				System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		s.close();
	}

}
