import java.util.*;
class betnum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		if(n>l && n<r)
		{
			System.out.print("Yes");
		}
		else
			System.out.print("No");
	}	
}	
