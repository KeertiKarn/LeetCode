class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = arr[0] - 1;

        if (count >= k) {
            return k;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int missing = arr[i + 1] - arr[i] - 1;
            count += missing;

            if (count >= k) {
                return arr[i + 1] - (count - k) - 1;
            }
        }

        return arr[arr.length - 1] + (k - count);
    }
}