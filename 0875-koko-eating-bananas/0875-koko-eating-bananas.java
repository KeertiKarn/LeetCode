class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max= Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++) {
            if(piles[i]>max) max=piles[i];
        }
        int low=1;
        int high=max;
        while(low<=high){
            int mid= low+(high-low)/2;
            long hour= helper(piles,mid); //mid k rate se wo kitne der m kha payega
            if(hour<=h) high=mid-1;
            else low=mid+1;
        }
        return low;
    }
    public long helper(int[] piles, int mid){
        long count=0;
        for(int i=0;i<piles.length;i++){
            count+= (piles[i] + mid - 1) / mid;
        }
        return count;
    }
}