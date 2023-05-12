//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ob.gfSeries(N);
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static void gfSeries(int N){
        
        System.out.print(0 + " ");
        System.out.print(1 + " ");
        
        helper(N,0,1);
        System.out.println("");
    }
    
    static void helper(int n, long a, long b)
    {
        if(n>2){
            long c = (a*a) - b;
            System.out.print(c + " ");
            a=b;
            b=c;
            helper(n-1,a,b);
        }
    }
    
    
    
    
}