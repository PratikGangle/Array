class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>> list = new ArrayList<>();
        boolean [][] board = new boolean[n][n];
        Queen(board, 0 , list);       
        return list;
    }
    
     public static void Queen (boolean[][] board, int row, List<List<String>> list){
        
        if(row == board.length){
            display(board ,list);           
        }
         
        for (int col = 0; col < board.length; col++) {

            if(isSafe(board, row, col)){
                board[row][col] = true;
                Queen(board, row+1 , list);
                board[row][col] =false;
            }            
        }
    }
    
    public static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // check diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }
    
    public static void display(boolean[][] board ,List<List<String>> list) {

        List<String> temp = new ArrayList<>();
        for (boolean[] row : board) {
            String ans ="";
            for (boolean element : row) {
                if (element) {
                   ans +="Q";
                } else {
                    ans+="." ;
                }
            } 
            temp.add(ans);
        }
        
        list.add(temp);
       
    }
    
}