package Study;

import java.util.Scanner;

public class DigitSum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,sum=0,a,b;
    	
		Scanner now =new Scanner(System.in);
    	System.out.println("enter the number of digits in the no.");
    	b=now.nextInt();
    	System.out.println("enter the number=");
    	n=now.nextInt();
    	sum=b|n;

    	System.out.println("sum = " +sum);
    	now.close();
	}

}
