class Solution {
    public int chalkReplacer(int[] chalk, int k) {        
        long totalChalk = 0;
        
        for(int val : chalk){
            totalChalk += val;
        }
        // remaining chalk after k th itreation                
        int remaingChalk = (int)(k%totalChalk);        
        
        for(int i=0; i<chalk.length; i++){            
            if(chalk[i] > remaingChalk){
                return i;
            }            
            remaingChalk -= chalk[i];
        }        
        return -1;
    }    
}