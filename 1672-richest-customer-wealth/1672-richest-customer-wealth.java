class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth=0;
        for(int i=0;i<accounts.length;i++){
            int curr=0;
            for(int j=0;j<accounts[0].length;j++){
               curr+=accounts[i][j];
            }
            max_wealth= Math.max(max_wealth,curr);
        }
        return max_wealth;
    }
}