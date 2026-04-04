class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
        }
        int sum2=0;
        int i=nums.length-1;
        List<Integer> ans= new ArrayList<>();
        while(sum2<=sum1){
           sum2+=nums[i];
           sum1-=nums[i];
           ans.add(nums[i]);
           i--;
        }
        return ans;

    }
}