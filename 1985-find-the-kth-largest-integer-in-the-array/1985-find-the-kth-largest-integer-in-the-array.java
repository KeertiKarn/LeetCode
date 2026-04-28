class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> pq= new PriorityQueue<>((a,b)->{
            if(a.length()==b.length())  return b.compareTo(a);
            return b.length()-a.length();
        });
        for(int i=0;i<nums.length;i++) pq.add(nums[i]);
        while(!pq.isEmpty() && k>1){
            pq.remove();
            k--;
        }
        return pq.peek();
    }
}