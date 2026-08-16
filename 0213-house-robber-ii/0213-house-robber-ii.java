class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] dp1= houserobber1(0,nums.length-2,nums);
        int[] dp2= houserobber1(1,nums.length-1,nums);
        return Math.max(dp1[dp1.length-1],dp2[dp2.length-1]);
    }
    public int[] houserobber1(int i, int j,int[] nums){
      int len=j-i+1;
      int[] dp= new int[len];
      dp[0]=nums[i];
      if(len==1) return dp;
      dp[1]=Math.max(nums[i],nums[i+1]);
      for(int x=2;x<len;x++){
        dp[x]=Math.max(dp[x-1],nums[i+x]+dp[x-2]);
      }
      return dp;
    }
}