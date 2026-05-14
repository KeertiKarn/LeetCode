class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1) return nums;
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->b[0]-a[0]);
        int[] ans= new int[nums.length-k+1];
        int idx=0;
        //first window
        for(int i=0;i<k;i++){
            pq.add(new int[]{nums[i],i});
        }
         ans[idx]=pq.peek()[0];
         idx++;
         for(int i=k;i<nums.length;i++){
            pq.add(new int[]{nums[i],i});
            while(pq.peek()[1]<i-k+1){ //outside window
                 pq.remove();
            }
            ans[idx]=pq.peek()[0];
            idx++;
         }
         return ans;

    }
}