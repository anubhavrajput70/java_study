package recursion;
import java.util.*;
public class PowerSetOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to print all its power sets");
		String s=sc.nextLine();
		sc.close();
		
		String s1="";
		powerSet(s,0,s1);
	}
	static void powerSet(String s, int i,String curr)
	{
		if(i==s.length())
		{
			System.out.println(curr);
			return;
		}
		powerSet(s,i+1,curr+s.charAt(i));
		powerSet(s,i+1,curr);
	}
}
