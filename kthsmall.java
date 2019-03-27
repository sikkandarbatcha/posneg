import java.util.*;
class kthsmall
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
			if(i==k) 
			{
				min=a[i-1];
			}	
		}
		System.out.print(min);
	}
}	
