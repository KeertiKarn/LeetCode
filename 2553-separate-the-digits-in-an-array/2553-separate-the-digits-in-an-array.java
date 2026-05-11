class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            StringBuilder sb= new StringBuilder();
            sb.append(n);
            int j=0;
            while(j<sb.length()){
                arr.add(sb.charAt(j)-'0');
                j++;
            }
        }
        int[] ans= new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}