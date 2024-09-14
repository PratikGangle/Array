class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<paths.size(); i++){
            List<String> list = paths.get(i);
            String s = list.get(0);
            map.put(s,1);
        }
        
          
        for(int i=0; i<paths.size(); i++){           
            List<String> list = paths.get(i);          
            String s = list.get(1);            
            if(!map.containsKey(s)){
                  return s;
              }          
        }    
        
        return "-1";
        
    }
}