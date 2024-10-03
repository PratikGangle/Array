class Solution {
    public List<String> fizzBuzz(int n) {
           List<String> ans = new ArrayList<String>(n);
        for(int i=1,fizz=0,buzz=0;i<=n ;i++){
            fizz++;
            buzz++;
            if(fizz==3 && buzz==5){
                ans.add("FizzBuzz");
                fizz=0;
                buzz=0;
            }else if(fizz==3){
                ans.add("Fizz");
                fizz=0;
            }else if(buzz==5){
                ans.add("Buzz");
                buzz=0;
            }else{              
                ans.add(i + "");
            }
        } 
        return ans;    
    }
}