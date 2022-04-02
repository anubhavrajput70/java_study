package array2d;
import java.util.Scanner;
public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of rows in the array");
		int r=s.nextInt();
		int[][] arr;
		arr=new int[r][];
		for(int i=0;i<r;i++)
		{
			System.out.println("enter the no. of column in "+ (i+1)+" row");
			int c=s.nextInt();
			arr[i]=new int[c];
			System.out.println("enter the elements in "+i+1+" row");
			for(int j=0;j<c;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("array elements are=");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		s.close();
		}
	    }

