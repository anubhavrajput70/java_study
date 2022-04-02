package bitManipulation;

public class OneNonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,4,1,4,3,5,1};
		int res=0;
		for(int i=0;i<a.length;i++)
		{
			res=res^a[i];
		}
		System.out.println("the only non repeating element is = "+res);
	}

}
