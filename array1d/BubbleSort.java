package array1d;
public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {8,32,3,34,2,4,5,23};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
				break;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
