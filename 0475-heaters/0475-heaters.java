class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int n=houses.length;
        int m=heaters.length;
        int x= Math.max(Math.abs(heaters[0]-houses[0]),Math.abs(heaters[0]-houses[n-1]));
        int y= Math.max(Math.abs(heaters[m-1]-houses[0]),Math.abs(heaters[m-1]-houses[n-1]));
        int high= Math.min(x,y);
        int low=0;
        int result=high;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(isPossible(mid,houses,heaters)){
                   result=mid;
                   high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
    public boolean isPossible(int mid,int[] houses, int[] heater){
        int i=0;
        int j=0;
        while(i<houses.length && j<heater.length){
            int start= heater[j]-mid;
            int end= heater[j]+mid;
            if(start<=houses[i] && houses[i]<=end) i++;
            else j++;
        }
        return i==houses.length;
    }
}