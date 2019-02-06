import java.util.*;
import java.io.*;
class strnrev
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();String st ="";
		int n = Integer.parseInt(bf.readLine());
		int len = str.length();
		for(int i = len-1;i>n;--i)
		{
			st=st+str.charAt(i);
		}
		System.out.print(st);
	}
}	
