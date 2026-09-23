class Solution {
    public int minOperations(int[] nums, int x) {
        int n= nums.length;
        int sum=0;
        for(int ele:nums) sum+=ele;
        int k= sum-x;
        if(k<0) return -1;
        if(k==0) return n;
        int left=0;
        int right=0;
        int curr=0;
        int ans=-1;
        while(right<n){
            curr+=nums[right];
            while(left<=right && curr>k){
                curr-=nums[left];
                left++;
            }
            if(curr==k) ans=Math.max(ans,right-left+1);
            right++;
        }
        if(ans==-1) return -1;
        return n-ans;
    }
}