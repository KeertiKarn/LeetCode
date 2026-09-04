class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] suffixmin= new int[nums.length];
        suffixmin[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
           suffixmin[i]=Math.min(nums[i],suffixmin[i+1]);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            int val= max-suffixmin[i];
            if(val<=k) return i;
        }
        return -1;
    }
}