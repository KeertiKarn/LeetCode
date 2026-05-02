class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int ele: amount) {
            if(ele>0) pq.add(ele);
        }
        int count=0;
        while(pq.size()>=2){
            int max= pq.remove();
            int smax=pq.remove();
            max--;
            smax--;
            count++;
            if(max>0) pq.add(max);
            if(smax>0) pq.add(smax);
        }
        if(!pq.isEmpty()) count+=pq.remove();
        return count;

    }
}