import java.util.*;
class ap
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int d = sc.nextInt();
		int sum = 0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a;
			a=a+d;
		}
		
		System.out.println(sum);
	}
}	
