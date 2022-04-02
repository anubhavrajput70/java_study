package Study;

public class MaxChar {
	public static void main(String[] args) {
		String s="minimum";
		char c=0,d=0;	
		int count=0,max=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					c=s.charAt(i);
				}
			}
			if(max<count)
			{
				max=count;
				d=c;
			}
		}
		System.out.println(d);
	}
}
