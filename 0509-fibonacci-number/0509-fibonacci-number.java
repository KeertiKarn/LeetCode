class Solution {
    public int fib(int n) {
        int[] dp= new int[n+1];
        return helper(n,dp);
    }
    public int helper(int n,int[] dp){
        if(n==1 || n==0) return n;
        dp[0]=0;
        dp[1]=1;
        if(dp[n]!=0) return dp[n];
        return dp[n]=helper(n-1,dp)+helper(n-2,dp);
    }
}