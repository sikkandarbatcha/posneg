import java.util.*;
import java.io.*;
class numcount 
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		int l = str.length();
		int count = 0;
		for(int i = 0; i < l; i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				count++;
			}	
		}
		System.out.println(count);
	}
}	
