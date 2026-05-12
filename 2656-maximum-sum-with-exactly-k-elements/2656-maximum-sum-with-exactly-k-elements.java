class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int ele:nums) max=Math.max(max,ele);
        int count=0;
        int ans=0;
        while(k>0){
            ans+=max+count;
            count++;
            k--;
        }
        return ans;
    }
}