import java.util.*;
class powsum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = sc.nextInt();
		int pr =1;
		while(n>0)
		{
			pr=pr*a;
			n--;
		}
		System.out.print(pr);
	}
}	
