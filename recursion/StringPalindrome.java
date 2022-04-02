package recursion;
import java.util.*;
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to check palindrome");
		String s=sc.nextLine();
		sc.close();
		System.out.println(isPalin(s,0,s.length()-1));
	}
	static boolean isPalin(String s,int l,int r)
	{
		if(l>=r)
			return true;
		if(s.charAt(l)!=s.charAt(r))
			return false;
		return isPalin(s,l+1,r-1);
		
	}
	

}
