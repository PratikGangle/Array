class Solution {
    
    List<List<Integer>> anslist = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        helper(list,target , candidates, 0 );
        
        return anslist;
    }
    
    public void helper(List<Integer> list , int target , int[] arr, int index){
        
        if(arr.length == index){
            if( target == 0){
                 anslist.add(new ArrayList<>(list));
            }
              return;
        }
        
        // include the array element
         if(arr[index] <= target){
             list.add(arr[index]);  // add the element in the list
             helper(list, target-arr[index] , arr , index);
            list.remove(list.size()-1);  // remove the element in the list
        }
        
        // not include the array element               
        helper(list, target , arr , index+1);
    }
}