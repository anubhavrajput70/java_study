package bitManipulation;

public class ThriceRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,2,1,5,1,1,2};
		int[] bits=new int[32];
	    for(int i=0;i<a.length;i++) 
	    {
			for(int j=0;j<32;j++) 
				{
					if((a[i])&(1<<j))
					bits[j]++;
				}
		}
			int ans=0;
		    for(int i=0;i<32;i++)
		    {
		  		if(bits[i]%3==0) 
		  		ans+=(1<<i);
			}
			
		System.out.println(ans);
	}
}


