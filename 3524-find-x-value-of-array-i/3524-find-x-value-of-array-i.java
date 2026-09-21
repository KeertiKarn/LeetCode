class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] result = new long[k];
        int[] cnt = new int[k];
        int[] newCnt = new int[k];
        
        for (int num : nums) {
            int a = num % k;
            Arrays.fill(newCnt, 0);
            
            for (int r = 0; r < k; r++) {
                if (cnt[r] != 0) {
                    newCnt[(r * a) % k] += cnt[r];
                }
            }
            newCnt[a] += 1;
            
            int[] temp = cnt;
            cnt = newCnt;
            newCnt = temp;
            
            for (int r = 0; r < k; r++) {
                result[r] += cnt[r];
            }
        }
        
        return result;
    }
}