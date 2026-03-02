class Solution {
    public boolean canPartition(int[] nums) {
        int n= nums.length;
        int sum=0;
        for(int ele: nums) sum+=ele;
        if(sum%2!=0) return false;
        int target= sum/2;
        Boolean dp[][] = new Boolean[n+1][target+1];
        return helper(nums,n,target,dp);
    }
    public boolean helper(int[] nums,int n, int target, Boolean[][] dp){
        if(n==0){
            if(target==0) return true;
            return false;
        } 
        if(dp[n][target]!=null) return dp[n][target];
        if(target<nums[n-1]) return dp[n][target]= helper(nums,n-1,target,dp);
        return dp[n][target]= helper(nums,n-1,target-nums[n-1],dp) || helper(nums,n-1,target,dp);
    }
}