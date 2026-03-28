class Solution {
    public int minimumOperations(int[] nums) {
    int count=nums.length;
    HashSet<Integer> set= new HashSet<>();
    for(int ele: nums) {
        if(set.contains(ele) || ele==0) count--;
        set.add(ele);
    }
    return count;
    }
}