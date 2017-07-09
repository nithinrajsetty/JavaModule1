import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  charx1;
	  Scanner s= new Scanner(System.in);
	  System.out.println("ENTER x1:");
	  x1=s.next().charAt(0);
	  if(x1=='a'||x1=='e'||x1=='i'||x1=='o'||x1=='u'||x1=='A'||x1=='E'||x1=='I'||x1=='O'||x1=='U')
	  System.out.println("x1 is vowel");
          else 
	  System.out.println("x1 is consonant");
	 
	}
}
