class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        int ans=Integer.MAX_VALUE;
        int minwater=Integer.MAX_VALUE;
        for(int i=0;i<waterStartTime.length;i++){
            minwater= Math.min(minwater,waterStartTime[i]+waterDuration[i]);
        }

         for(int i=0;i<landStartTime.length;i++){
            ans = Math.min(ans, Math.max(minwater,landStartTime[i])+landDuration[i]);
        }
       
        
      
        int minland=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            minland= Math.min(minland,landStartTime[i]+landDuration[i]);
        }
      
         for(int i=0;i<waterStartTime.length;i++){
           ans= Math.min(ans,Math.max(minland,waterStartTime[i])+waterDuration[i]);
        }
        
        return ans;
    }
}