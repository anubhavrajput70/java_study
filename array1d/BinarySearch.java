package array1d;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,4,6,9,12,16,19,21,45};
		System.out.print("given sorted array is=");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println("\nenter the element to search=");
		int item=sc.nextInt();
		sc.close();
		int high=arr.length;
		int low=arr[0];
		int mid=(high+low)/2;
		while(low<=high)
		{
			if(arr[mid]==item)
			{
				System.out.println("item found at "+mid+" index");
				break;
			}
			else if(arr[mid]<item)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
			mid=(high+low)/2;
		}

	}

}
