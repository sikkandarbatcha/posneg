import java.util.*;
import java.io.*;
class strrevvow
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String str = bf.readLine();
		StringBuilder s2 = new StringBuilder();
		String s = "";String ss="";
		s=str.replaceAll("[aeiouAEIOU]","");
		s2.append(s);
		s2=s2.reverse();
		System.out.print(s2);
	}
}	
