class Solution {
    public int[] minCosts(int[] cost) {
        int[] ans= new int[cost.length];
        int min= Integer.MAX_VALUE;
        for(int i=0;i<cost.length;i++){
            if(min>cost[i]) min=cost[i];
            ans[i]=min;
        }
        return ans;
    }
}