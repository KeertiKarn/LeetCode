class Solution {
    public int missingInteger(int[] nums) {
      int i=1;
      int sum=nums[0];
      while(i<nums.length && nums[i-1]+1==nums[i]){
        sum+=nums[i];
        i++;
      }
      HashSet<Integer> set= new HashSet<>();
      for(int ele: nums) set.add(ele);
      while(set.contains(sum)) sum++;
      return sum;
    }
}