class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
        Arrays.sort(maximumHeight);
        long sum=0;
        int curr=Integer.MAX_VALUE;
        for(int i=maximumHeight.length-1;i>=0;i--){
            curr = Math.min(curr-1,maximumHeight[i]);
            if(curr<=0) return -1;
            sum += curr;
        }
        return sum;
    }
}