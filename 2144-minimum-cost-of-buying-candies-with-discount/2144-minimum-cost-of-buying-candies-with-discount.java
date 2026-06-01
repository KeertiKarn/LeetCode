class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int count=1;
        int result=0;
        for(int i=cost.length-1;i>=0;i--){
           if(count<3){
            result+=cost[i];
            count++;
           }
           else{
            count=1;
           }
        }
        return result;
    }
}