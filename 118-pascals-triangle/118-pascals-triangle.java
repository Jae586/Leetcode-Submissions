class Solution {
    public List<List<Integer>> generate(int numRows) {
       List <List<Integer>> answer = new ArrayList();
        if (numRows == 0) return answer;
        
        ArrayList <Integer> rowOne = new ArrayList<>();
        rowOne.add(1);
        answer.add(rowOne);
        for (int i=1; i<numRows; i++ ){
            List<Integer> currentRow = new ArrayList<>();
            List<Integer> lastRow = answer.get(i-1);
            currentRow.add(1);
            
            for (int j=1; j<i; j++){
                currentRow.add(lastRow.get(j-1)+lastRow.get(j));
            }
            currentRow.add(1);
            answer.add(currentRow);
            
        }
        
        
        return answer;
    }
}