class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        pq.add(a); pq.add(b); pq.add(c);
        int count=0;
        while(pq.size()>=2){
           int first= pq.remove();
           int second= pq.remove();
           if(first-1>0) pq.add(first-1);
           if(second-1>0) pq.add(second-1);
           count++;
        }
        return count;
    }
}