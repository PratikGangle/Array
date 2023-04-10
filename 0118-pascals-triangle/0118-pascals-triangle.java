class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
             List<Integer> list = new ArrayList<>();
             list.add(1);
             ans.add(list);
        if(numRows == 1){
            return ans;
        }
       
          List<Integer> list2 = new ArrayList<Integer>();
               list2.add(1);
               list2.add(1);
               ans.add(list2);
          if(numRows == 2){
               return ans;
        }
        
        for(int i=1;  i<numRows-1; i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            List<Integer> l = ans.get(i);
            
            for(int j=0; j<l.size()-1;  j++){
               temp.add(l.get(j) + l.get(j+1));               
            }
            temp.add(1);
            ans.add(temp);
        }
     
       
            
            return ans;
    }
}