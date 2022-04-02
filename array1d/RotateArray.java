package array1d;
import java.util.*;
public class RotateArray{
		 
		      public static void main(String[] args)
	                 {
	                     RotateArray ra=new RotateArray();
	                 Scanner in = new Scanner(System.in);
	                 System.out.println("enter the size of array");
		             int N = in.nextInt();
		             System.out.println("enter element to rotate");
		             int D = in.nextInt();
		             System.out.println("enter array elements");
		             int a[]= new int[N];
		             for(int i=0; i<N; i++)
		             {
		                a[i] = in.nextInt();
		             }
		             in.close();
	                   ra.leftRotate(a,N,D);
	                   System.out.println("rotated array is= ");
	                   ra.printArray(a,N);
	                 }
		    
		             void leftRotate(int a[] , int N,int D)
		             {
		             for(int i=0;i<D;i++)
		             {
		                 leftRotatebyOne(a,N);
		             }
		             }
		             void leftRotatebyOne(int a[], int N)
	                 {
	                 int i, temp;
	                 temp = a[0];
	                 for (i = 0; i < N - 1; i++)
	                     a[i] = a[i + 1];
	                 a[N-1] = temp;
	                 }
	                 void printArray(int a[], int N)
	                 {
	                 for (int i = 0; i < N; i++)
	                 System.out.print(a[i] + " ");
	                 }
	                
		 //code
		 
		 
	}

