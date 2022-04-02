package array1d;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {56,45,23,54,21,65,32,42};
		int temp,j;
		for(int i=1;i<arr.length;i++)
		{
			temp=arr[i];
			j=i;
			while(j>0&&arr[j-1]>temp)
			{
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
