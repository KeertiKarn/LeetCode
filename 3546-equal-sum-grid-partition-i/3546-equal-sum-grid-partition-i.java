class Solution {
    public boolean canPartitionGrid(int[][] grid) {
       int m= grid.length;
       int n=grid[0].length;
       long[] rowsum= new long[m];
       long[] colsum= new long[n];
       for(int row=0; row<m; row++) {
           long sum=0;
            for (int col=0;col<n; col++) {
               sum+= grid[row][col];
            }
          rowsum[row]=sum;
    }
      for(int col=0;col<n;col++) {
           long sum=0;
            for (int row=0;row<m;row++) {
               sum+= grid[row][col];
            }
          colsum[col]=sum;
    }
    return ispart(rowsum)||ispart(colsum);
}
 public boolean ispart(long[] arr){
    int n= arr.length;
    long[] prefix= new long[n];
    prefix[0]=arr[0];
    for(int i=1;i<n;i++) prefix[i]=prefix[i-1]+arr[i];
    if(prefix[n-1]%2!=0) return false;
    for(int i=0;i<n-1;i++){
        if(prefix[i]==prefix[n-1]-prefix[i]) return true;
    }
    return false;
 }
}