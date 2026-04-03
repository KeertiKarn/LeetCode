class Solution {
    public int findLongestChain(int[][] pairs) {
        //if(pairs.length==1) return 1;
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int i=0;
        int j=1;
        int count=1;
        while(j<pairs.length){
        int end=pairs[i][1];
        int start=pairs[j][0];
          if(end<start){
            count++;
            i=j;
          }     
            j++;
        }
        return count;
    }
}