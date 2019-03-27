import java.util.*;
class rectwo {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();int res =0;
	if(n%2==0)
	{
		res=n/2;
		System.out.print(res);
	}
	else
		System.out.print(n);
}
}
