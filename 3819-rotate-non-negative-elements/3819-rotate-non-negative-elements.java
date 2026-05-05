class Solution {
    public int[] rotateElements(int[] nums, int k) {
      int count=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]>=0) count++;
      }  
      if(count==0) return nums;
      int[] arr= new int[count];
      int j=0;
       for(int i=0;i<nums.length && j<count;i++){
        if(nums[i]>=0) {
            arr[j]=nums[i];
            j++;
        }
      }
      k=k%count;
      rotate(arr,k);
      j=0;
     for(int i=0;i<nums.length && j<count;i++){
        if(nums[i]>=0){
            nums[i]=arr[j];
            j++;
        }
      }
      return nums;

    }
    
    public void rotate(int[] arr,int k){
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}