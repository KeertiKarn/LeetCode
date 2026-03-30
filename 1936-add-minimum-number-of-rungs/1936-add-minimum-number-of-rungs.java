class Solution {
    public int addRungs(int[] rungs, int dist) {
       int curr=0;
       int count=0;
       for(int i=0;i<rungs.length;i++){
        int diff= rungs[i]-curr;
        if(diff>dist){
          count += (diff-1)/dist;
        }
        curr= rungs[i];
       } 
       return count;
    }
}