class Solution {
    public int minMoves(int[] nums) {
       int max=Integer.MIN_VALUE;
       for(int ele: nums){
        max= Math.max(ele,max);
       } 
       int count=0;
       for(int ele: nums){
        count+=max-ele;
       }
       return count;
    }
}