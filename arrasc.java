import java.util.*;
class arrasc
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();int i=0;
		int a[] = new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			if(a[i]>a[j])
			{
				max = a[i];
				System.out.print(i);
			}	
		}
		
	}
}	
