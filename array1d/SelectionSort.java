package array1d;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {56,45,23,54,21,65,32,42};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
