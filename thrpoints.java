import java.util.*;
class thrpoints
{
	public static void main(String args[])throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		if((x1==x2) && (x1==x3) || (y1==y2) && (y1==y3))
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}	
	}
}	
