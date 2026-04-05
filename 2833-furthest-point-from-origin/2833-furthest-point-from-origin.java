class Solution {
    public int furthestDistanceFromOrigin(String moves) {
       int left= 0;
       int right=0;
       int extra=0;
       for(int i=0;i<moves.length();i++){
        if(moves.charAt(i)=='L') left++;
        else if(moves.charAt(i)=='R') right++;
        else extra++;
       } 
       return Math.abs(left-right)+extra;
    }
}