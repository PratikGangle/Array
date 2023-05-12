//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            StringBuilder out = new StringBuilder();
            ans = ob.jugglerSequence(N);
            for(int i = 0;i < ans.size();i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Integer> jugglerSequence(int N){
        // code here
        List<Integer> list = new ArrayList<>();
        list.add(N);
        helper(N,list);
        
        return list;
    }
    
    
    static void helper(int n , List<Integer> list){
        
        if(n == 1){
            return;
        }
        int temp;
        if(n % 2 ==0){
            temp = (int) Math.pow(n,0.5);
        }
        else{
            temp = (int) Math.pow(n,1.5);
        }
        
        list.add(temp);
        helper(temp,list);
    }
}