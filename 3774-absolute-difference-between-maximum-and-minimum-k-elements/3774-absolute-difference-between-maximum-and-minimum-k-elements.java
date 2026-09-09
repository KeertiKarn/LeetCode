class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int sum1=0;
        int count=0;
        while(i<nums.length && count<k){
            sum1+=nums[i];
            i++;
            count++;
        }
        int sum2=0;
        count=0;
         while(j>=0 && count<k){
            sum2+=nums[j];
            j--;
            count++;
        }
        return Math.abs(sum1-sum2);
    }
}