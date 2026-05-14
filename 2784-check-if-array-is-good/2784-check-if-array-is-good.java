class Solution {
    public boolean isGood(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       for(int i=0;i<nums.length-1;i++){
        if(nums[i]!=i+1) return false;
       } 
       if(nums[n-1]!=n-1) return false;
       return true;
    }
}