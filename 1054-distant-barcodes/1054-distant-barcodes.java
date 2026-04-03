class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int ele: barcodes){
            if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
            else map.put(ele,1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int ele: map.keySet()){
            pq.add(ele);
        }
        int i=0;
        int[] ans= new int[barcodes.length];
        while(!pq.isEmpty()){
          int ele= pq.remove();
          if(i>0 && ans[i-1]==ele){
            int next=pq.remove();
            ans[i]=next;
            map.put(next,map.get(next)-1);
            if(map.get(next)>0) pq.add(next);
            pq.add(ele);
          }
          else{
            ans[i]=ele;
             map.put(ele,map.get(ele)-1);
           if(map.get(ele)>0) pq.add(ele);
          }
          i++;
        }
        return ans;
    }
}