class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        HashSet<Integer> set= new HashSet<>();
        long sum= (long)k*(k+1)/2;
        int temp=k;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=temp && !set.contains(nums[i])){
             sum = sum-nums[i]+(temp+1);
             temp=temp+1;
             set.add(nums[i]);
            }
        }
        return sum;
    }
}