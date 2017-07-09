import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int n;
	  int sum=0;
	 Scanner s= new Scanner(System.in);
	 n=s.nextInt();
	 sum=n*(n-1)/2;
	 System.out.println("sum:"+sum);
  	}
}