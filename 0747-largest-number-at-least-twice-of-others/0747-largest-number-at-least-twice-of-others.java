class Solution {
    public int dominantIndex(int[] nums) {
        int max= Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
              max=nums[i];
              ans=i;
            }
        }
        Arrays.sort(nums);
        if(2*nums[nums.length-2]>max) return -1;
        return ans;
    }
}