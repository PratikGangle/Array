//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            ArrayList<Long> ans = new Solution().nthRowOfPascalTriangle(n);
            printAns(ans);
        }
    }
    public static void printAns(ArrayList<Long> ans) {
        for (Long x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        
        ArrayList<Long> list = new ArrayList<>();
        long var =1;
        list.add(var);
        
        if(n==1){
            return list;
        }
        list.add(var);
        
        if(n==2){
            return list;
        }
        
       return  helper(n-2,list);
        
        // return list;
    }
    
     ArrayList<Long> helper(int n,  ArrayList<Long> list ){
        if(n ==0){
            return list;
        }
        long mod=(long)1e9+7;
        ArrayList<Long> temp = new ArrayList<>();
        long k =1;
        temp.add(k);
        for(int i=1; i<list.size(); i++){
            long a= list.get(i-1);
            long b = list.get(i);
            temp.add(i,((a+b)%mod));
        }
        temp.add(k);
        // System.out.println(list);
        return helper(n-1,temp);
    }
}