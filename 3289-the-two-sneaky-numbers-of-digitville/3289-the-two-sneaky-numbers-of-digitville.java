class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = {0,0};
        int i=0;
        HashSet<Integer> set= new HashSet<>();
        for(int ele: nums){
            if(set.contains(ele)){
                ans[i]=ele;
                i++;
                if(i>1) return ans;
            }
            else set.add(ele);
        }
        return ans;
    }
}