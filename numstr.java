import java.io.*;
class numstr
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		if(str.matches("[a-zA-Z ]*\\d+.*") || str.matches("[0-9]*\\d+.*"))
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");
		}
	}
}	
