class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curr=0;
        int ans=0;
        int total=0;
        for(int i=0;i<gas.length;i++){
            curr = curr+gas[i]-cost[i];
            total = total+gas[i]-cost[i]; //if there is more demand than supply this will be negative
            if(curr<0) {
                curr=0;
                ans= i+1;
            }
        }
        if(total<0) return -1;
        return ans;
    }
}