class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<List<Integer>> ();        
        solve(1 , n , k ,new ArrayList<>(), ans);
        return ans;
    }
    
    
     public void solve (int start ,int n, int k, List<Integer> list , List<List<Integer>> ans) {
         if(k == 0){
             ans.add(new ArrayList<>(list));
             return;
         }         
         if(start > n){
             return;
         }
         
         // take
         list.add(start);
         solve(start+1, n, k-1, list,ans);
         list.remove(list.size()-1);
         
         // not take
         solve(start+1,n,k,list,ans);       
    }    
}