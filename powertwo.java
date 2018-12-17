import java.util.*;
class powertwo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(((~n) & 1) == 1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}	
	}
}
