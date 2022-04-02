package ifElse;
import java.util.*;
public class VotingCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age of the person =");
		int a=sc.nextInt();
		if(a<18)
			System.out.println("not eligible for voting");
		else
			System.out.println("eligible for voting");
		sc.close();
	}

}
