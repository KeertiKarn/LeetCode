class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n= nums.length;
        int[][] dp= new int[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=nums[i];
        }
        for(int i=2;i<=n;i++){
            for(int j=0;j<=n-i;j++){
              int idx=i+j-1;
              int takeleft= nums[j]-dp[j+1][idx];
              int takeright= nums[idx]-dp[j][idx-1];
              dp[j][idx]=Math.max(takeleft,takeright);
            }
        }
        return dp[0][n-1]>=0;
    }
}