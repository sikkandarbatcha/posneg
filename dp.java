import java.util.*;
class dp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int rr =0;
		int rs =0;
		int rp = 0;
		rp=n%10;
		rs=(n%100)/10;
		rr=(n%1000)/100;
		System.out.print(rr + " " + rs + " " + rp);
		
			
	}
}	
