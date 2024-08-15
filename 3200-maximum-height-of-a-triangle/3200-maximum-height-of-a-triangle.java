class Solution {
    public int maxHeightOfTriangle(int red, int blue) {        
        int a = check (red,blue);
        int b = check(blue,red);        
        return Math.max(a,b);       
    }
    
    public int check(int red, int blue) {
        int level= 1;
        int flag = 1;
        while(true){            
            if(flag == 0){
                flag =1;
                if(blue < level) break;
                blue = blue - level;
            }
            else{
                flag = 0;
                if(red < level) break;
                red = red - level;
            }
            level++;            
        }    
        return level-1;
    }    
}