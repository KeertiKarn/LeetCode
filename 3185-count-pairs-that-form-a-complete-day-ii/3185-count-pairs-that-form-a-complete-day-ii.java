class Solution {
    public long countCompleteDayPairs(int[] hours) {
        int[] freq= new int[24];
        long count=0;
        for(int time: hours){
            int rem= time%24;
            int comp=(24-rem)%24;
            count+=freq[comp];
            freq[rem]++;
        }
        return count;
    }
}