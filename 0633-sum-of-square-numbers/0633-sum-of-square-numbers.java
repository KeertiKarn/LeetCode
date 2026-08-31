class Solution {
    public boolean judgeSquareSum(int c) {
        int low = 0;
        int high = (int) Math.sqrt(c);

        while (low <= high) {
            int rem = c - (low * low);
            int sq = (int) Math.sqrt(rem);

            if (sq * sq == rem)
                return true;

            low++;
        }

        return false;
    }
}