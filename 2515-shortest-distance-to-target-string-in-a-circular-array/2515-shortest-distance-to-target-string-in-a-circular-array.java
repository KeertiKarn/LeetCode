class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int ans= Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(target)){
                int dis= Math.abs(startIndex-i);
                int cdis= words.length-dis;
                ans= Math.min(ans,Math.min(dis,cdis));
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}