package Study;

public class NonPairElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,3,2,4};
		int k=0,b=0;
		int a=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
			if(a==arr[j])
			{
				if(k<arr.length-1)
				{
				k++;
				a=arr[k];
			    }
				else
					b=arr[j];
			}
			}
		}
		System.out.println(b);

	}

}
