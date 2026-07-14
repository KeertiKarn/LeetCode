class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            if(min<prices[i]){
                profit+=prices[i]-min;
                min=prices[i];
            }
        }
        return profit;
    }
}