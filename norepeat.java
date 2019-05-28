import java.util.*;
class norepeat
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i =0; i <n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print(nonRepeating(a,n));
	}
	static int nonRepeating(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) { 
            int j; 
            for (j = 0; j < n; j++) 
                if (i != j && arr[i] == arr[j]) 
                    break; 
            if (j == n) 
                return arr[i]; 
        } 
  
        return -1; 
    } 
}			
