class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
      Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));  
      int i=1;
      int j=0;
      int count=0;
      while(i<intervals.length){
        if(intervals[i][0]<intervals[j][1]) count++;
        else j=i;
        i++;
        
      }
      return count;
    }
}