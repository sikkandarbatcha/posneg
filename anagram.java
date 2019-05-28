import java.io.*;
import java.util.*;
class anagram
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String str[]= new String[n];String s = "kabali";int c =0;
		for(int i =0;i<n;i++)
		{
			str[i]=bf.readLine();
		}
		for(int i =0;i<n;i++)
		{
			if(s.charAt(i)==str[i].charAt(i))
			{
				c++;
			}
		}
		System.out.print(c);
	}
}
