class Solution {
    static final int MOD = 1_000_000_007;

    public int[] sumAndMultiply(String s, int[][] queries) {

        int n = s.length();

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> digit = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = s.charAt(i) - '0';
            if (d != 0) {
                pos.add(i);
                digit.add(d);
            }
        }

        int m = digit.size();

        long[] prefNum = new long[m + 1];
        long[] prefSum = new long[m + 1];
        long[] pow10 = new long[m + 1];

        pow10[0] = 1;
        for (int i = 1; i <= m; i++)
            pow10[i] = (pow10[i - 1] * 10) % MOD;

        for (int i = 0; i < m; i++) {
            prefNum[i + 1] = (prefNum[i] * 10 + digit.get(i)) % MOD;
            prefSum[i + 1] = prefSum[i] + digit.get(i);
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            int left = lowerBound(pos, l);
            int right = upperBound(pos, r) - 1;

            if (left > right) {
                ans[i] = 0;
                continue;
            }

            long sum = prefSum[right + 1] - prefSum[left];

            int len = right - left + 1;

            long x = (prefNum[right + 1]
                    - (prefNum[left] * pow10[len]) % MOD
                    + MOD) % MOD;

            ans[i] = (int) ((x * sum) % MOD);
        }

        return ans;
    }

    private int lowerBound(ArrayList<Integer> arr, int target) {
        int l = 0, r = arr.size();
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) >= target)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    private int upperBound(ArrayList<Integer> arr, int target) {
        int l = 0, r = arr.size();
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) > target)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}