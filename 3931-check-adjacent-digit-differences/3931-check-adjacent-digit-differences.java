class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=0;i<s.length()-1;i++){
            int x=s.charAt(i);
            int y=s.charAt(i+1);
            if(Math.abs(x-y)>2) return false;
        }
        return true;
    }
}