class Solution {
    public int minSumOfLengths(int[] arr, int target) {

        int n = arr.length;

        // best[i] = shortest target-sum subarray
        // completely inside indices [0 ... i-1]
        int[] best = new int[n + 1];

        int INF = n + 1;

        // Initially, no valid subarray exists
        for (int i = 0; i <= n; i++) {
            best[i] = INF;
        }

        int left = 0;
        int sum = 0;
        int ans = INF;

        for (int right = 0; right < n; right++) {

            sum += arr[right];

            // Shrink window if sum becomes too large
            while (sum > target) {
                sum -= arr[left];
                left++;
            }

            // Carry forward the previous best
            best[right + 1] = best[right];

            // Found a target-sum subarray
            if (sum == target) {

                int length = right - left + 1;

                // Check if there is a non-overlapping
                // target-sum subarray before this one
                if (best[left] != INF) {
                    ans = Math.min(ans, length + best[left]);
                }

                // This is the shortest target subarray
                // ending at or before 'right'
                best[right + 1] =
                    Math.min(best[right + 1], length);
            }
        }

        return ans == INF ? -1 : ans;
    }
}