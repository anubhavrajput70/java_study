package Study;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(12,27));
	}
    static int gcd(int a,int b)
    {
    	if(b==0)
    		return a;
    	return gcd(b, a%b);
    				
    }
}
