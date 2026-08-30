class Solution {
    public int findPeakElement(int[] nums) {
        int low= 0, high = nums.length - 1;
        
        while (low<high) {
            int mid= low+(high-low)/2;
            
            if(nums[mid]>nums[mid+1]){
                // Go left (peak is on left side)
                high = mid;
            } else {
                // Go right (peak could be mid itself)
                low = mid+1;
            }
        }
        return low;  // or high (both same here)
    }
}
