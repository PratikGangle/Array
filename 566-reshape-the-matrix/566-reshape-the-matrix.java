class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int[][] ans = new int[r][c];

        int row = 0;
        int col = 0;

        if (mat.length * mat[0].length == r * c) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {

                    ans[row][col] = mat[i][j];

                    col++;

                    if (col == c) {
                        col = 0;
                        row++;
                    }
                }

            }
            return ans;
        }

        else {
            return mat;

        }

    }
}
