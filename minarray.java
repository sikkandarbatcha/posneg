import java.util.*;
class minarray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = 10
		int a[] = new int[n];
		for(int i =0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int min = a[0];
		for(int i = 0;i<n;i++)
		{
			if(min>a[i])
			{
				min = a[i];
			}
		}
		
		System.out.println(min);
	}
}
