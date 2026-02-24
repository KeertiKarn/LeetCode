class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int start=0;
        int sum=0;
        int maxsum = Integer.MIN_VALUE;
        for(int end=0;end<k;end++){
            sum += cardPoints[end];
        }
        maxsum= Math.max(maxsum,sum);
        start=k-1;
        int end= cardPoints.length-1;
        while(start>=0){
            sum = sum-cardPoints[start] + cardPoints[end];
            start--;
            end--;
            maxsum= Math.max(maxsum,sum);
        }
        return maxsum;
    }
}