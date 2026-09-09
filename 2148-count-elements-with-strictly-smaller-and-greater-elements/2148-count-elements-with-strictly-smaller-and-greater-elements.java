class Solution {
    public int countElements(int[] nums) {
        if(nums.length<3) return 0;
        Arrays.sort(nums);
        if(nums[0]==nums[nums.length - 1]) return 0;
        int i=1;
        int j=nums.length-2;
        while(i<nums.length && nums[i-1]==nums[i]) i++;
        while(j>=0 && nums[j]==nums[j+1]) j--;
        return j-i+1;
    }
}