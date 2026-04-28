class Solution {
    public int maxDistToClosest(int[] seats) {
        int i=0;
        int j=0;
        while(j<seats.length && seats[j]!=1) j++;
        int max= (j-i);
        while(j<seats.length){
            i=j;
            j++;
            while(j<seats.length && seats[j]!=1) j++;
            max=Math.max(max,(j-i)/2);
        }
        if(seats[seats.length-1]==0) max=Math.max(max,(seats.length-1-i));
        return max;
    }
}