class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int one= nums[0]*nums[1];
        int two=nums[nums.length-1]*nums[nums.length-2];
        return two-one;
    }
}