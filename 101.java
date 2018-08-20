	/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=sc.nextInt();
		int n1=str.length();
		for(int i=n1-n;i<n1;i++)
		{
			System.out.print(str.charAt(i));
		}
	}
}
