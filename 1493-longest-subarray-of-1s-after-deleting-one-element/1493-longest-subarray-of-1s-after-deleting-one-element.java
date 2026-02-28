class Solution {
    public int longestSubarray(int[] nums) {
        int nozero= 0;
        int start=0;
        int maxlen= Integer.MIN_VALUE;
        for(int end=0;end<nums.length;end++){
            if(nums[end]==0) nozero++;
            while(nozero>1){
                if(nums[start]==0) nozero--;
                start++;
            }
             maxlen= Math.max(maxlen,end-start);
        }
        if(maxlen==Integer.MIN_VALUE) return 0;
        return maxlen;
    }
}