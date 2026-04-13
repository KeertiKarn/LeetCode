class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
       int i=start;
       int j=start; 
       int ans= Integer.MAX_VALUE;
       while(i>=0 || j<nums.length){
        if(i>=0 && nums[i]==target) ans=Math.min(ans,Math.abs(i-start));
        else if(j<nums.length && nums[j]==target) ans= Math.min(ans,Math.abs(j-start));
        i--;
        j++;
       }
       return ans;
    }
}