import java.util.*;
class rightshift
{
	public static void main(String args[])
	{
		rightshift rs = new rightshift();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k =sc.nextInt();
		int a[] = new int[n];int j=0;
		for(int i =0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		 rs.leftRotate(a, k, n); 
		 rs.printarr(a,n);
	}	 
		void leftRotate(int arr[], int d, int n) 
		{ 
			for (int i = 0; i < d; i++) 
				leftRotatebyOne(arr, n); 
				
		}	 
  
		void leftRotatebyOne(int arr[], int n) 
		{	 
			int i, temp; 
			temp = arr[n]; 
			for (i = 0; i < n - 1; i++) 
				arr[i] = arr[i + 1]; 
			arr[i] = temp; 
		}	 
		void printarr(int arr[],int n)
		{
			for(int i =0;i<n;i++)
			{
				System.out.print(arr[i]);
			}
		}	
	}
