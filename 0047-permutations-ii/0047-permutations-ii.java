class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
       List<List<Integer>> ans= new ArrayList<>();
       Arrays.sort(nums);//smallest permutation

       int[] last= new int[nums.length]; //largest permutation
       for(int i=0;i<nums.length;i++) last[i]=nums[nums.length-1-i];

        ans.add(toList(nums));
        //while smallest did not reach largest
       while(!Arrays.equals(nums,last)){
        nextPermutation(nums); //take next permutation
        ans.add(toList(nums));
       }
       return ans;
    }
    public void nextPermutation(int[] nums) {
        int j=nums.length-1;
        int i=nums.length-2;
        while(i>=0){
            if(nums[i]<nums[i+1]) break;
            i--;
        }
        if(i>=0){
            while(nums[j]<=nums[i]){
                j--;
            }
            int temp= nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            
        }
        //reverse suffix
        reverse(nums,i+1,nums.length-1);
    }
    public void reverse(int[] nums,int i,int j){
        while(i<=j){
            int temp= nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    private List<Integer> toList(int[] nums) {
    List<Integer> list = new ArrayList<>();
    for(int num : nums) {
        list.add(num);
    }
    return list;
}
    

}