class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans=0;
        ans += (long) Math.min(costBoth,(cost1+cost2))*Math.min(need1,need2);
        if(need1>need2) ans+= (long) Math.min(cost1,costBoth)*(need1-need2);
        else ans+= (long) Math.min(cost2,costBoth)*(need2-need1);
        return ans;
    }
}