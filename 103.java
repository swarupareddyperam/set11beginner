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
		String s[]=new String[3];
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.next();
		}
		String s1=s[0];
		String s2=s[1];
		String s3=s[2];
		System.out.print(s1.substring(0,1).toUpperCase()+""+s1.substring(1).toLowerCase()+" "+s2.substring(0,1).toUpperCase()+""
+s2.substring(1).toLowerCase()+" "+s3.substring(0,1).toUpperCase()+""+s3.substring(1).toLowerCase());
}
}
