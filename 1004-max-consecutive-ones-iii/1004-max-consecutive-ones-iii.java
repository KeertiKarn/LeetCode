class Solution {
    public int longestOnes(int[] nums, int k) {
        int nozeros=0;
        int start=0;
        int max=0;
        for(int end=0;end<nums.length;end++){
            if(nums[end]==0) nozeros++;
            while(nozeros>k){
                if(nums[start]==0) nozeros--;
                start++;
            }
          max= Math.max(max,end-start+1);
        }
        return max;
    }
}