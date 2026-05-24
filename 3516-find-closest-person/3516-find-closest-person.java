class Solution {
    public int findClosest(int x, int y, int z) {
       int pos1= Math.abs(z-x);
       int pos2= Math.abs(z-y);
       if(pos1<pos2) return 1; 
       if(pos2<pos1) return 2;
       return 0;
    }
}