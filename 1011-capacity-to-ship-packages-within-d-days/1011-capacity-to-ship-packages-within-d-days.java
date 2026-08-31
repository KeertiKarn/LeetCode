class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        int max=0;
        for(int ele: weights){
            sum+=ele;
            max=Math.max(ele,max);
        }
        int low=max;
        int high=sum;
        int ans=high;
        while(low<high){
            int mid=low+(high-low)/2;
            if(ispossible(weights,mid)<=days){
               ans=mid;
               high=mid;
            }
            else low=mid+1;
        }
        return ans;
    }
    public int ispossible(int[] weights,int mid){
        int d=1;
        int i=0;
        int sum=0;
        while(i<weights.length){
                if(sum+weights[i]>mid){
                    d++;
                    sum=0;
                }
                sum+=weights[i];
                i++;
        }
        return d;
    }
}