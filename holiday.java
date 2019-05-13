import java.io.*;
class holiday
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		int len = str.length();int f=0;
		for(int i =0;i<len;i++)
		{
			if(str.charAt(0)=='S')  
			{
				f=1;
			}
			
		}
		if(f==1)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}	
	}
}	
