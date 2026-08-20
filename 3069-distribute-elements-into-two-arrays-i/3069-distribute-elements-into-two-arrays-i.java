class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1= new ArrayList<>();
        List<Integer> arr2= new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int temp1=0;
        int temp2=0;
        for(int i=2;i<nums.length;i++){
            if(arr1.get(temp1)>arr2.get(temp2)){
                temp1++;
                arr1.add(nums[i]);
            }
            else{
                temp2++;
                arr2.add(nums[i]);
            }
        }
        int i=0;
        for(int ele:arr1){
            nums[i++]=ele;
        } 
        for(int ele:arr2){
            nums[i++]=ele;
        }
        return nums;
    }
}