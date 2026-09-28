class Solution {
    public int maximumCount(int[] nums) {
        int pos=0;
        int neg=0;
        for(int ele: nums){
          if(ele<0) neg++;
          else if(ele>0) pos++;
        }
        return Math.max(pos,neg);
    }
}