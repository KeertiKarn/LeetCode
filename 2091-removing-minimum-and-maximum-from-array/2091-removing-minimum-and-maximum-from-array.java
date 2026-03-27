class Solution {
    public int minimumDeletions(int[] nums) {
        int minidx= 0;
        int maxidx= 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[minidx]) minidx=i;
            if(nums[i]>nums[maxidx]) maxidx=i;
        }
        int front = Math.max(minidx,maxidx)+1;
        int back = nums.length-Math.min(minidx,maxidx);
        int both = (Math.min(minidx,maxidx) +1) + (nums.length-Math.max(minidx,maxidx));
        return Math.min(Math.min(front,back),both);
    }
}