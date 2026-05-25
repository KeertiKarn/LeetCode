class KthLargest {
    PriorityQueue<Integer> pq;
    int size;
    public KthLargest(int k, int[] nums) {
       pq= new PriorityQueue<>();
       size=k;
       for(int ele:nums){
           pq.add(ele);
           if(pq.size()>k) pq.remove();
       }
    }
    
    public int add(int val){
        pq.add(val);
        if(pq.size()>size) pq.remove();
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */