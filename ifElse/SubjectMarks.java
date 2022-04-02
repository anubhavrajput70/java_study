package ifElse;
import java.util.*;
public class SubjectMarks {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks in math=\n");
		int math=sc.nextInt();
		System.out.println("enter the marks in science=\n");
		int science=sc.nextInt();
		System.out.println("enter the marks in history=\n");
		int history=sc.nextInt();
		System.out.println("enter the marks in hindi=\n");
		int hindi=sc.nextInt();
		System.out.println("enter the marks in english=\n");
		int english=sc.nextInt();
		int sum,parcentage,a;
		sum=math+science+history+hindi+english;
	    a=sum*100;
	    parcentage=a/500;
		System.out.println("total marks  is\t"+sum);
		System.out.println("parcentage is\t"+parcentage);
		if(parcentage>=70 && parcentage<80)
		{
			System.out.println("grade=C,Pass");
		}
		else if(parcentage>=80 && parcentage<90)
		{
			System.out.println("grade=B,pass");
		}
		else if(parcentage>=90)
		{
			System.out.println("grade=A,pass");
		}
		else if (parcentage>=30 && parcentage<70)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		sc.close();
	}
}
