class Solution {
    public int flipgame(int[] fronts, int[] backs) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<fronts.length;i++){
            if(fronts[i]==backs[i]) set.add(fronts[i]);
        }
        int ans=Integer.MAX_VALUE;
        for(int ele:backs){
            if(!set.contains(ele)) ans=Math.min(ans,ele);
        }
        for(int ele:fronts){
            if(!set.contains(ele)) ans=Math.min(ans,ele);
        }
        if(ans==Integer.MAX_VALUE) return 0;
        return ans;
    }
}