class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
     int row = mat.length;
        int col = mat[0].length;
        if (r*c != row*col) return mat;
        
        int rowNum =0;
        int colNum =0;
        int ans[][] = new int[r][c];
        
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                ans[rowNum][colNum]=mat[i][j];
                colNum++;
                if (colNum == c){
                    rowNum++;
                    colNum=0;
                }
            }
        }
        return ans;
    }
    
}