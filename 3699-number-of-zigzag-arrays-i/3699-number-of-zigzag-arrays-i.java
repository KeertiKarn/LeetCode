class Solution {
    private static final int MOD = 1_000_000_007;

    public int zigZagArrays(int n, int l, int r) {
        int rangeLength = r - l + 1;
        int lengthPlusOne = rangeLength + 1;

        // dp states: [position][valueIndex][0=no prev diff, 1=up diff, 2=down diff]
        int[][] prevDp = new int[rangeLength][3]; // for i-1
        int[][] currDp = new int[rangeLength][3]; // for i

        // Initialize for i=1: no previous difference (state 0) = 1 way for all values
        for (int i = 0; i < rangeLength; i++) {
            prevDp[i][0] = 1;
        }

        for (int i = 2; i <= n; i++) {
            // Build prefix sums for states from prevDp
            int[] prefixNoDiff = new int[lengthPlusOne];
            int[] prefixUpDiff = new int[lengthPlusOne];
            int[] prefixDownDiff = new int[lengthPlusOne];

            for (int val = 0; val < rangeLength; val++) {
                prefixNoDiff[val + 1] = modAdd(prefixNoDiff[val], prevDp[val][0], MOD);
                prefixUpDiff[val + 1] = modAdd(prefixUpDiff[val], prevDp[val][1], MOD);
                prefixDownDiff[val + 1] = modAdd(prefixDownDiff[val], prevDp[val][2], MOD);
            }

            for (int curr = 0; curr < rangeLength; curr++) {
                // Transition for diff=1 (up): sum of dp[i-1][prev][0 or 2] where prev < curr
                currDp[curr][1] = modAdd(prefixNoDiff[curr], prefixDownDiff[curr], MOD);

                // Transition for diff=2 (down): sum of dp[i-1][prev][0 or 1] where prev > curr
                int sumNoDiffAfter = modSub(prefixNoDiff[lengthPlusOne - 1], prefixNoDiff[curr + 1], MOD);
                int sumUpDiffAfter = modSub(prefixUpDiff[lengthPlusOne - 1], prefixUpDiff[curr + 1], MOD);
                currDp[curr][2] = modAdd(sumNoDiffAfter, sumUpDiffAfter, MOD);

                // No transition remains for diff=0 after i=1, reset to 0 for clarity
                currDp[curr][0] = 0;
            }

            // swap references for next iteration
            int[][] temp = prevDp;
            prevDp = currDp;
            currDp = temp;
        }

        // Calculate result: sum for final step over all values with diff = 1 or 2
        int ans = 0;
        for (int i = 0; i < rangeLength; i++) {
            ans = modAdd(ans, prevDp[i][1], MOD);
            ans = modAdd(ans, prevDp[i][2], MOD);
        }

        return ans;
    }

    private int modAdd(int a, int b, int mod) {
        a += b;
        if (a >= mod) a -= mod;
        return a;
    }

    private int modSub(int a, int b, int mod) {
        a -= b;
        if (a < 0) a += mod;
        return a;
    }
}