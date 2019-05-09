import java.util.*;
import java.io.*;
class charpos
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		char evarr[] = new char[20];
		char odarr[] = new char[20];
		int even=0;int odd=0;
		int len = str.length();
		for(int i =0;i<len;i++)
		{
			if(i%2==0)
			{
				evarr[i]=str.charAt(i);
				even++;
			}
			if(i%2==1)
			{
				odarr[i]=str.charAt(i);
				odd++;
			}
		}
		System.out.print(evarr);
		System.out.print(" ");
		System.out.print(odarr);
	}
}	
