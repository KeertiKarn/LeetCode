class Pair{
    int val;
    int row;
    Pair(int val,int row){
        this.val=val;
        this.row=row;
    }
}

class Solution {
    public long maxSum(int[][] grid, int[] limit, int k) {
       PriorityQueue<Pair> pq= new PriorityQueue<>((a,b)->b.val-a.val);
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++) {
            Pair temp= new Pair(grid[i][j],i);
            pq.add(temp);
        }
       }
       long ans=0;
       int[] lim= new int[limit.length];
       while(!pq.isEmpty() && k>0){
         Pair temp= pq.remove();
         if(lim[temp.row]<limit[temp.row]){
            ans+=temp.val;
            k--;
            lim[temp.row]++;
         }
       }
       return ans;
    }
}