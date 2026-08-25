class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set= new HashSet<>();
        for(int ele:nums) set.add(ele);
        for(int i=1;i<=nums.length+1;i++){
            int val =k*i;
            if(!set.contains(val)) return val;
        }
        return -1;
    }
}