class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long total= (long)m*k;
        if(total>bloomDay.length) return -1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int ele: bloomDay){
            min=Math.min(min,ele);
            max=Math.max(max,ele);
        }
        int low=min;
        int high=max;
        int d=0;
        while(low<high){
            int mid= low+(high-low)/2;
            if(noofBoquet(bloomDay,mid,k)>=m){
                d=mid;
                high=mid;
            }
            else low=mid+1;
        }
        return low;
    }
    public int noofBoquet(int[] bloomDay,int mid,int k){
        int count=0;
        int curr=0;;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                curr++;
            }
            else curr=0;
            if(curr==k){
                count++;
                curr=0;
            }
            
        }
        return count;
    }
}