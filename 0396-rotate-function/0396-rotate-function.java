class Solution {
    public int maxRotateFunction(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int fun=0; 
        //calculating fun(0) and sum
        for(int i=0;i<nums.length;i++){
          fun+=nums[i]*i;
          sum+=nums[i];
        }
        max=Math.max(max,fun);
        //calculating f(1) to f(n)
        for(int k=1;k<nums.length;k++){
          fun=fun+sum-nums.length*nums[nums.length-k];
          max=Math.max(max,fun);
        }
        return max;
    }
}