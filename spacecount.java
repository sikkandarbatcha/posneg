import java.util.*;
import java.io.*;
class spacecount
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		int len = str.length();
		int count = 0;
		for(int i =0;i<len;i++)
		{
			if((str.charAt(i))== ' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}	
			
