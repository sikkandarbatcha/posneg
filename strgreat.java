import java.util.*;
import java.io.*;
class strgreat
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String st = bf.readLine();
		int len = str.length();
		int lenn = st.length();
		if(len == lenn)
		{
			System.out.println(str);
		}
		else if(len>lenn)
		{
			System.out.println(str);
		}
		else if(len<lenn)
		{
			System.out.println(st);
		}	
	}
}
