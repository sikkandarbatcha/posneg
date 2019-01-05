import java.io.*;
class binarystring
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();int len = str.length();int flag =0;
		int n = Integer.parseInt(str.toString());
		while (n != 0)
		{ 
			if (n % 10 > 1) 
			{ 
				System.out.print("no");
				flag =1;
			} 
			n= n / 10; 
				
		} 
		if(flag == 0)
		{
			System.out.print("yes");
		}
		
	}
}	
