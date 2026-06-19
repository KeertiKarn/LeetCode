class Solution {
    public int largestAltitude(int[] gain) {
        int current= 0; // starting altitude
        int highest= 0; // highest altitude so far
        
        for(int g:gain){
            current+=g;              // add the current gain
            highest=Math.max(highest,current);
        }
        return highest;
    }
}
