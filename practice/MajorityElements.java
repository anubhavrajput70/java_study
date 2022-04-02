package Study;

public class MajorityElements {
	public static void main(String[] args) {
		int[] a= {5,1,4,5,5};
		System.out.println(majorityElement(a,a.length));
	}
	static int majorityElement(int[] a,int n)
	{
		int ansInd=0;
		int count=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==a[ansInd])
				count++;
			else
				count--;
			if(count==0)
			{
				ansInd=i;
				count=1;
			}
		}
		if(ansInd>(n/2))
			return a[ansInd];
		else
			return 0;
	}
}
