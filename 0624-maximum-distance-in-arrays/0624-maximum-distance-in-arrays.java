class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int max=Integer.MIN_VALUE;
        int maxar=0;
        int min=Integer.MAX_VALUE;
        int minar=0;
        for(int i=0;i<arrays.size();i++){
            List<Integer> temp= arrays.get(i);
           if(max<temp.get(temp.size()-1)){
                max=temp.get(temp.size()-1);
                maxar=i;
            }
            if(min>temp.get(0)){
                min=temp.get(0);
                minar=i;
            }
        }
        if(minar!=maxar) return Math.abs(max-min);
        int result=0;
        // If they are from the same array, try two scenarios to pick from different arrays:
        // 1. Max from second best array, min from current best
        // 2. Min from second best array, max from current best
        for(int i=0;i<arrays.size();i++){
            List<Integer> temp= arrays.get(i);
            if(maxar==i) continue;
            //current best with new min
            result=Math.max(result,Math.abs(max-temp.get(0)));
            //current min with new max
            result=Math.max(result,Math.abs(min-temp.get(temp.size()-1)));
        }
        return result;


    }
}