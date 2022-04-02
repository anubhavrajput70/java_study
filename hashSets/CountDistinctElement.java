package hashSets;

import java.util.*;

public class CountDistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,10,15,5,4,6};
		System.out.println("distinct elements are = "+countDistinct(a));
	}
	static int countDistinct(int[] a)
	{
		Set<Integer> s=new HashSet<>();
		for(int c:a)
			s.add(c);
		return s.size();
	}
}
