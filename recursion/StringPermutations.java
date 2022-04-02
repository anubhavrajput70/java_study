package recursion;

public class StringPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		permute(s,0,s.length()-1);

	}
	static void permute(String s,int l,int r)
	{
		if(l==r)
		{
			System.out.println(s);
			return;
		}
		for(int i=l;i<=r;i++)
		{
		s=swap(s,l,i);
		permute(s,l+1,r);
		s=swap(s,l,i);	
		}
	}
	static String swap(String s,int l, int i)
	{
		StringBuilder sb=new StringBuilder(s);
		sb.setCharAt(l,s.charAt(i));
		sb.setCharAt(i,s.charAt(l));
		return sb.toString();

	}
}
