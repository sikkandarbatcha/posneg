
import java.io.*;
import java.lang.*;

class Palindrome
{
	public static void main(String args[])throws Exception
	{
		
		String s1,s2="";int i;
		System.out.println(" Enter a String ");
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(is);
		
		s1 = bf.readLine();
        int length=s1.length();
        for(i=length-1;i>=0;i--)
        s2=s2+s1.charAt(i);		
		
		if(s1.equals(s2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}






