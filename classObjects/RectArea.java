package classObjects;
import java.util.Scanner;
class RectArea{
	int len,bre;
	static int area;
	void setDim(int l,int b)
	{
		len=l;
		bre=b;
	}
	int getArea()
	{
		area=len*bre;
		return area;
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of the rectangle =");
		int length=scan.nextInt();
		System.out.println("enter the breadth of the rectangle =");
		int breadth=scan.nextInt();
		RectArea ar=new RectArea();
		ar.setDim(length,breadth);
		area=ar.getArea();
		System.out.println("area of rectangle is = "+area);
		scan.close();
	}
}


		
	
