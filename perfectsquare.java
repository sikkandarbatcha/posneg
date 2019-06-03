import java.util.*;
class perfectsquare
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int i = 0;double tmp;int cnt=0;int tt=0;
		for( i = l; i<=r;i++)
		{
			tmp=Math.sqrt(i);
			if((tmp-Math.floor(tmp))==0)
			{
				cnt++;
			}
		}
		System.out.print(cnt);
	}
}	
