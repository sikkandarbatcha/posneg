import java.util.*;
class apsum{ 
   
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0; 
        for (int i = 0; i < n; i++) 
        { 
            sum = sum + a; 
            a = a + d; 
        } 
        
        System.out.println(sum); 
    } 
} 
