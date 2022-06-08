class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
    int x1 = coordinates[0][0];
        int x2 = coordinates[1][0];
        int y1 = coordinates[0][1];
        int y2 = coordinates[1][1];
        
        int a = x2-x1;
        int b = y1-y2;
        int c = x1*b + y1*a;
        
        for (int i=2; i<coordinates.length; i++){
            int curr = b*coordinates[i][0] + a*coordinates[i][1];
            if (curr != c) return false;
        }
        return true;
        
    }
}