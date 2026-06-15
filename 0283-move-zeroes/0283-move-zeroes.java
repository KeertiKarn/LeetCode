class Solution {
    public void moveZeroes(int[] nums) {
       int i=0;
       int idx=0;
       while(i<nums.length){
        if(nums[i]!=0){
            int temp=nums[i];
            nums[i]=nums[idx];
            nums[idx]=temp;
            idx++;
        }
        i++;
       } 
    }
}