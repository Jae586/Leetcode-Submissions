class Solution {
    public int diagonalSum(int[][] mat) {
      int size = mat.length;
        int sum =0;
        for (int i=0; i<mat.length; i++){
            sum+= mat[i][i];
        }
        for (int i=0; i<mat.length; i++){
            sum+= mat[i][size-i-1];
        } if (size %2 == 1){
            sum = sum - mat[size/2][size/2];
        }
        return sum;
    }
}