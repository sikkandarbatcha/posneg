import java.util.*;
import java.io.*;
class repchar
{
	static final int ASCII_Code=256;
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		System.out.print("Repeated character:"+getrepeatedcharacter(str));
	}
	static char getrepeatedcharacter(String s)
	{
		int count[] = new int[ASCII_Code];
		int l =s.length();
		for(int i =0;i<l;i++)
			count[s.charAt(i)]++;
		int max = -1;
		char res = ' ';
		for(int i=0;i<l;i++)
		{
			if(max<count[s.charAt(i)])
			{
				max=count[s.charAt(i)];
				res=s.charAt(i);
			}
		}
		return res;
	}
}	
