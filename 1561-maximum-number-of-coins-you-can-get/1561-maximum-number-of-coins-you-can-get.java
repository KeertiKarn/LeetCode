class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n= piles.length;
        int i=piles.length-2;
        int sum=0;
        while(i>=n/3){
            sum += piles[i];
            i=i-2; 
        }
        return sum;

    }
}