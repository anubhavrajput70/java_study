package hashSets;
import java.util.*;
public class UnionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> c=new HashSet<>();
		int[] a= {5,10,15,5};
		int[] b= {10,15,4,5};
		c=union(a,b);
		 Iterator<Integer> it = c.iterator();
		    while (it.hasNext()) 
	            System.out.print(it.next() + " ");
	}
	static HashSet<Integer> union(int[] a,int[] b)
	{
		HashSet<Integer> s=new HashSet<>();
		for(int x:a)
			s.add(x);
		for(int x:b)
			s.add(x);
		return s;
	}
}
