package Study;

public class Patt {
	public static void main(String... s) 
	{ 
	for(int i=1;i<=5;i++) 
	  { 
	   for(int j=1;j<=1;j++) 
	   	{ 
		   System.out.print(" H"); 
	   	} 
	   for(int k=2;k<=5;k++) 
	   { 
		   if(i>2 && i<4) 
		   { 
			   System.out.print(" H"); 
		   } 
		   else 
		   { 
			   System.out.print("  "); 
		   } 
	   } 
	   for(int j=1;j<=1;j++) 
	   { 
		   System.out.print(" H"); 
	   } 
	   System.out.println( ); 
	  } 
	} 
	
}
