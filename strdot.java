import java.io.*;
class strdot
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		str=str.concat(".");
		System.out.print(str);
	}
}
