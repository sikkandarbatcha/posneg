import java.util.*;
class evenintervals
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i=a+1;i<b;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+ " ");
			}
			
		}
	}
}	
