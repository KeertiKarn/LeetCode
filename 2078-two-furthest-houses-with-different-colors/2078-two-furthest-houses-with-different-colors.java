class Solution {
    public int maxDistance(int[] color) {
        int ans= 0;
        for(int i=0;i<color.length;i++){
            int j=color.length-1;
            while(color[i]==color[j]) j--;
            ans=Math.max(ans,Math.abs(i-j));
        }
        return ans;
    }
}