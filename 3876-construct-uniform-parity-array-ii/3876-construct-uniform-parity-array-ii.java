class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd=Integer.MAX_VALUE;
        for(int ele: nums1){
            if(ele%2!=0) odd=Math.min(ele,odd);
        }
        if(odd==Integer.MAX_VALUE) return true;

        // Try to make everything odd.
        // Every even number must be > smallest odd.
         for (int ele : nums1) {
            if (ele % 2 == 0 && ele <= odd) {
                return false;
            }
        }
        return true;
    }
}