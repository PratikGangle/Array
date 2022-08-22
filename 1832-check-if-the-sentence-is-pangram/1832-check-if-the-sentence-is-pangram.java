class Solution {
    public boolean checkIfPangram(String sentence) {
        
       // create a new array 
        
        int[] arr =new int[26];
        
        int var=0;
        for (int i = 0; i < sentence.length(); i++) {
               
         var = sentence.charAt(i);

        var = var-97;

        arr[var] = 1;
        
       }

       // check every element is present or not
       boolean check = true;
       for (int i = 0; i < arr.length; i++) {

        
        if(arr[i] == 0){

          return false;
        }
       }

      return true;
    }
}