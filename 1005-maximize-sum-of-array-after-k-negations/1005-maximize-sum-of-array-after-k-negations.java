class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int sum=0;
        int min= Integer.MAX_VALUE;
        while(i<nums.length){
            if(nums[i]<0 && k>0){
            nums[i]=-nums[i];
            k--;
        }
        if(min>nums[i]) min=nums[i];
        sum+= nums[i];
        i++;
        }
        if(k%2==0) return sum;
        return sum-(2*min);
    }
}