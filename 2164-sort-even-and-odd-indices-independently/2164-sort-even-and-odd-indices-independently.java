class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        int evenCount = (n + 1) / 2;
        int oddCount = n / 2;
        
        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];
        
        int evenIdx = 0, oddIdx = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even[evenIdx++] = nums[i];
            } else {
                odd[oddIdx++] = nums[i];
            }
        }
        
        // Sort even indices in ascending order
        Arrays.sort(even);
        
        // Sort odd indices in ascending order, then iterate backwards for descending
        Arrays.sort(odd);
        
        evenIdx = 0;
        oddIdx = odd.length - 1; // start from largest to place in descending order
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = even[evenIdx++];
            } else {
                nums[i] = odd[oddIdx--];
            }
        }
        
        return nums;
    }
}