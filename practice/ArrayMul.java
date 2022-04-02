package Study;

public class ArrayMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int k=3;
		int[] arr= {7,8,2,3,1};
		int sum=0;
		for(int i=0;i<n;i++)
		{
			int mul=0;
		if(k<n)
		{
		mul=arr[i]*arr[k];
		sum=sum+mul;
		k++;
		}
		}
		System.out.println(sum);
	}
}
