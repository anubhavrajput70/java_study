package waysToReadInput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderClass {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		throws IOException
	{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your name");
		String name=reader.readLine();
		System.out.println(name);
	}
}
