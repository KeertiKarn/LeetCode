class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        List<Integer> ans= new ArrayList<>();
        int i=nums.length-1;
        int sum=0;
        int curr=0;
        while(i>=0 && k>0){
           curr=nums[i];
           sum+=curr;
           ans.add(curr);
           k--;
           i--;
           while(i>=0 && curr==nums[i] ) i--;
        }
        int[] res= new int[ans.size()];
        for(i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}