import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int x1,x2,x3;
   	  int larger;
	  Scanner s= new Scanner(System.in);
	  x1=s.nextInt();
          x2=s.nextInt();
	  x3=s.nextInt();
	  {
	  if(x1>x2)
         larger=x1;
     	  else 
	 larger=x2;
	}
	{
	  if(larger>x3)
	  System.out.println("larger:"+larger);
	  else
	  System.out.println("larger:"+x3);
	}
	}
}