class Solution {
    public long maxAlternatingSum(int[] nums) {
       for(int i=0;i<nums.length;i++) nums[i]=Math.abs(nums[i]);
       Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        long ans=0;
        while(i<=j){
         if(i==j){
            ans+=(long)nums[j]*nums[j];
            i++;
            j--;
         }
         else{
         long pos= (long)nums[j]*nums[j];
         ans+=pos;
         j--;
         long neg= (long)nums[i]*nums[i];
         i++;
         ans= ans-neg;
        }
        }
        
        return ans;
    }
}