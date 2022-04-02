package bitManipulation;

public class TwoNonRepeat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,4,1,4,3,5,1,2};
		int res=0;
		for(int i=0;i<a.length;i++)
		{
			res=res^a[i];
		}
		int temp=res;
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if((a[i]&1)!=0)
			b[i]=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			res=res^b[i];
		}
		temp=temp^res;
		System.out.println("first no. is = "+res+"\nsecond no. is = "+temp);
	}

}
