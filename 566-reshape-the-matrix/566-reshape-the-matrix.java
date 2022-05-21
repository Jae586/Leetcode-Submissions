class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
      int row = mat.length;
        int column =mat[0].length;
         if (r*c != row*column) return mat;
        
        int rowNum =0;
        int colNum =0;
        int[][] ans = new int[r][c];
        
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                ans[rowNum][colNum] = mat[i][j];
                colNum ++;
                if (colNum == c){
                    colNum =0;
                    rowNum++;
                }
            }
            
        }
    return ans;
    }
    
}