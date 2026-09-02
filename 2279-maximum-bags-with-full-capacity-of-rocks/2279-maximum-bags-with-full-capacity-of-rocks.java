class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n=capacity.length;
        int[][] arr= new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=capacity[i];
            arr[i][1]=rocks[i];
        }
        Arrays.sort(arr,(a,b)->(a[0]-a[1])-(b[0]-b[1]));
        int i=0;
        int count=0;
        while(additionalRocks>0 && i<n){
           int avail = arr[i][0]-arr[i][1];
           if(avail<=additionalRocks)count++;
            additionalRocks-=avail;
           i++;
        }
        return count;
    }
}