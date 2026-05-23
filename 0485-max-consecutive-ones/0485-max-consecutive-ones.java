class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int len= 0;
        while(i<nums.length){
            while(i<nums.length && nums[i]!=1) i++;
             int j=i;
             while(j<nums.length && nums[j]==1) j++;
             len= Math.max(len,j-i);
             i=j;
        }
        return len;
    }
}