package waysToReadInput;
//Java program to demonstrate working of System.console()
//Note that this program does not work on IDEs as
//System.console() may require console
public class ConsoleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your name");
        // Using Console to input data from user
		String name=System.console().readLine();
		System.out.println("your name is "+name);
	}

}
