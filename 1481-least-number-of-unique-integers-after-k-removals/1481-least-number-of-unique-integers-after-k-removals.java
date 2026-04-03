class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
       HashMap<Integer,Integer> map= new HashMap<>();
       for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i])+1);
        else map.put(arr[i],1);
       } 
       PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
       for(int ele:map.keySet()) pq.add(ele);
       while(k>0){
         int ele=pq.remove();
         map.put(ele,map.get(ele)-1);
         if(map.get(ele)>0) pq.add(ele);
         k--;
       }
       return pq.size();
    }
}