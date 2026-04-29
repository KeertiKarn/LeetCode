class Solution {
    public long maxProduct(int[] nums) {
        for(int i=0;i<nums.length;i++) nums[i]=Math.abs(nums[i]);
        Arrays.sort(nums);
        long one=nums[nums.length-1];
        long second=nums[nums.length-2];
        long third=(long)Math.pow(10,5);
        long ans= one*second*third;
        return ans;
    }
}