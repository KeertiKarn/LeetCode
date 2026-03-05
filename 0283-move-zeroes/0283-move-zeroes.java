class Solution {
    public void moveZeroes(int[] nums) {
        int pos = 0;

        for(int idx = 0; idx < nums.length; idx++){
            if(nums[idx] != 0){
                int temp = nums[pos];
                nums[pos] = nums[idx];
                nums[idx] = temp;
                pos++;
            }
        }
    }
}