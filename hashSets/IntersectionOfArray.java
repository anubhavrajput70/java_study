package hashSets;

import java.util.HashSet;
public class IntersectionOfArray {
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int[] a= {5,10,15,5,10};
			int[] b= {10,15,4};
	
			System.out.println(intersectionPoint(a,b));
		}
		static int intersectionPoint(int[] a,int[] b)
		{
			int count=0;
			HashSet<Integer> s=new HashSet<>();
			for(int x:a)
				s.add(x);
			for(int x:b)
			{
				if(s.contains(x))
				{
					count++;
					s.remove(x);
				}
			}
			return count;
		}
}
