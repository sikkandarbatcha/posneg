import java.util.*;
class lcm
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res=0;
		res= lcm(a,b);
		System.out.print(res);
	}
	static int lcm(int x,int y)
	{
		return x*y/ggccdd(x,y);
	}	
	static int ggccdd(int m, int n)
	{
		if(m==0)
			return m;
		
		if(n==0)
			return n;
		
		if(m == n)
			return m;
		
		if(m>n)
			return ggccdd(m-n,n);
		else
			return ggccdd(m,n-m);
			
	}
}	
