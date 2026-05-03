class Solution {
    public int minMoves(int[] nums) {
       int min=Integer.MAX_VALUE;
       for(int ele: nums){
        if(ele<min) min=ele;
       }
      int sum=0;
      for(int i=0;i<nums.length;i++){
        sum+=Math.abs(nums[i]-min);
      }    
      return sum;
    }
}