class Solution {
    public int minSetSize(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i])+1);
            else map.put(arr[i],1);
        }
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int value: map.values()) pq.add(value);
        int count=0;
        int removed=0;
        int target=n/2;
        while(removed<target){
            int freq= pq.remove();
            removed += freq;
            count++;
        }
        return count;
   }
}