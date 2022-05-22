class Solution {
    public boolean isValidSudoku(char[][] board) {
            HashSet <String> checker  = new HashSet<>();
        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                
                char curr = board[i][j];
                if (curr != '.'){
                    if (!checker.add( curr + "was found in row" + i) ||
                         !checker.add (curr + "was found in column" + j) ||
                       !checker.add(curr+ "was found in box" + i/3 + "-"+ j/3)) return false;
            
                }
            }
        }
        return true;
    }
}