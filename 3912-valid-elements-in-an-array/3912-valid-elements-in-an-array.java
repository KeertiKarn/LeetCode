class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        boolean[] prefixmax= new boolean[nums.length];
        boolean[] suffixmax= new boolean[nums.length];
        int n=nums.length;
        prefixmax[0]=true;
        suffixmax[n-1]=true;
        int pmax=nums[0];
        int smax=nums[n-1];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>pmax) {
                prefixmax[i]=true;
                pmax=nums[i];
            }
        }
        for(int i=n-2;i>=0;i--){
            if(nums[i]>smax){
            suffixmax[i] = true;
            smax = nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(suffixmax[i] || prefixmax[i]) ans.add(nums[i]);
        }
        return ans;
    }
}