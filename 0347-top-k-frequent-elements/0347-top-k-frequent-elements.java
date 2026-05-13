class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int ele: nums){
            if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
            else map.put(ele,1);
        }
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->{
            int x= map.get(a);
            int y=map.get(b);
            return y-x;
        }
        );
        for(int ele: map.keySet()) pq.add(ele);
        int[] ans= new int[k];
        int i=0;
        while(k>0){
            ans[i]=pq.remove();
            k--;
            i++;
        }
        return ans;
    }
}