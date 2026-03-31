class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            int d1= Math.abs(a-x);
            int d2= Math.abs(b-x);
            if(d1==d2) return a-b;
            return d1-d2;
        });
        for(int ele: arr) pq.add(ele);
        ArrayList<Integer> ans = new ArrayList<>();
        while(!pq.isEmpty() && k>0){
            ans.add(pq.remove());
            k--;
        }
        Collections.sort(ans);
        return ans;
    }
}