class Solution {
    public int maxProfit(int[] prices) {
            int maxProf = 0;
            int counter = prices[0];
            int profit =0;
            for (int i=0; i<prices.length; i++){
                int current = prices[i];
                profit = current-counter;
                if (maxProf < profit) maxProf = profit;
                if (current < counter) counter = current;
            }
    
    return maxProf;
    }
}