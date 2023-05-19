class Solution {
    public int findTheWinner(int n, int k) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=1 ; i<=n; i++){
            list.add(i);
        }        
         solve(0, k-1,list);
        
        return list.get(0);
    }
    
    public void solve(int index ,int k , List<Integer> list){        
        if(list.size()  == 1){
            return; 
        } 
        index = (index + k) % list.size();
        
        // killing the k th person
        list.remove(index);
        
        // call a recursive function
        solve(index ,k ,list);
    }
}