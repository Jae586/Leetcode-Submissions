class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       int row = mat.length;
        int column = mat[0].length;
        if (row*column != r*c) return mat;
        
        int[][] answerArr = new int[r][c];
        int row_num = 0;
        int column_num =0;
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                answerArr[row_num][column_num]=mat[i][j];
                column_num++;
                if (column_num == c){
                    column_num =0;
                    row_num++;
                    }
                }
            
            }
        return answerArr;
        }
    
    
}