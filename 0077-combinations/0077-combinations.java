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
      
         for(int i= start ; i<=n; i++){
             list.add(i);       
             solve(1+i, n, k-1, list,ans);      
             list.remove(list.size()-1);
         }         
    }    
}