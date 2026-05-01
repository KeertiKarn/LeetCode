class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        long sum=0;
        for(int i=0;i<gifts.length;i++) {
            pq.add(gifts[i]);
            sum+=gifts[i];
        }
        while(!pq.isEmpty() && k>0){
            int num= pq.remove();
            int sqr= (int)Math.sqrt(num);
            sum=sum-(num-sqr);
            if(sqr>0) pq.add(sqr);
            k--;
        }
        return sum;
    }
}