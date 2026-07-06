class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0]) return b[1]-a[1];
            return a[0]-b[0];
        });
        int i=0;
        int count=0;
        while(i<intervals.length-1){
            int start=intervals[i][0];
            int end=intervals[i][1];
            while(i<intervals.length-1 && intervals[i+1][1]<=end && start<=intervals[i+1][0]){
             i++;
             count++;
            }
            i++;
        }
        return intervals.length-count;
    } 
}
