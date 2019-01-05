import java.io.*;
class strk
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		int k = Integer.parseInt(bf.readLine());
		for(int i =0;i<k;i++)
		{
			System.out.print(str.charAt(i));
		}
	}
}	
