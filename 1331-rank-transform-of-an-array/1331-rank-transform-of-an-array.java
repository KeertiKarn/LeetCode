class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->{
            return arr[a]-arr[b];
        });
        for(int i=0;i<arr.length;i++){
            pq.add(i);
        }
        int val=0;
        if(!pq.isEmpty()) {
            val=arr[pq.peek()];
        }
        int rank=1;
        while(!pq.isEmpty()){
            int idx=pq.remove();
            if(arr[idx]!=val) rank++;
            val=arr[idx];
            arr[idx]=rank;
        }
        return arr;
    }
}