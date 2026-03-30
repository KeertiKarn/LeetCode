class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        int sum=0;
        int i=0;
        while(i<heights.length-1){
            if(heights[i]>heights[i+1]) i++;
            else{
                int diff= heights[i+1]-heights[i];
                pq.add(diff);
                sum+= diff;
                while(sum>bricks && ladders>0){
                    int out= pq.remove();
                    sum-=out;
                    ladders--;
                }
                if(sum>bricks && ladders<=0) return i;
                i++;
            }
            
        }
        return  heights.length - 1;
    }
}