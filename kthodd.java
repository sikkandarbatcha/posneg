import java.util.*;
class kthodd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];int min =0;
		for(int i =0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i =0;i<n;i++)
		{
			if((i==k)&& (a[i]%2!=0))
			{
				min=a[i];
			}
			else if ((i == k) && (a[i]%2==0))
			{
				min = a[i-1];
			}	
		}
		System.out.print(min);
	}
}	
