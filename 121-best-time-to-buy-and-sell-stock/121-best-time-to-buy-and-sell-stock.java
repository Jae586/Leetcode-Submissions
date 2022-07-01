class Solution {
    public int maxProfit(int[] prices) {
    int maxProf =0;
        int profit = 0;
        int counter = prices[0];
        for (int i=0; i<prices.length; i++){
            int curr = prices[i];
            profit = curr-counter;
            if (maxProf < profit) maxProf = profit;
            if (curr < counter) counter = curr; 
            
            
        }
        return maxProf;
    }
}