import java.util.*;
class sum {
	public static void main(String args[])
	{
		int s=0;
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			s+=a[i];
		}
			
		
		System.out.println(s);
	}
}
