class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int start=0;
        while(start<nums.length-1){
            if(nums[start]<=nums[start+1]) start++;
            else break;
        }
        if(start==nums.length-1) return 0;
        int end=nums.length-1;
        while(end>0){
            if(nums[end]>=nums[end-1]) end--;
            else break;
        }
        //find min and max
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=start;i<=end;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        //expand left
        while(start>0 && nums[start-1]>min) start--;
        //expand right
        while(end<nums.length-1 && nums[end+1]<max) end++;
        
        return end-start+1;
    }
}