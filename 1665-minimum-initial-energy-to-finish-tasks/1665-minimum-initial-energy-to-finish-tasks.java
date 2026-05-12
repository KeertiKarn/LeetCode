class Solution {
    public int minimumEffort(int[][] tasks) {
       Arrays.sort(tasks,(a,b)->(b[1]-b[0])-(a[1]-a[0]));
       int n=tasks.length;
       int min=tasks[0][1];
       int curr=min-tasks[0][0];
       for(int i=1;i<n;i++){
        int req= tasks[i][1];
        int spend= tasks[i][0];
        if(curr<req){
         int add= req-curr;
         min+=add;
         curr+=add;
        }
        curr-=spend;
       } 
       return min;
    }
}