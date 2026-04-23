class Solution {
    public int[] arrayChange(int[] nums, int[][] operation) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++) map.put(nums[i],i);

        for(int i=0;i<operation.length;i++){
            int num1= operation[i][0];
            int num2= operation[i][1];
            int idx= map.get(num1);
            map.remove(num1);
            map.put(num2,idx);
            nums[idx]=num2;
        }
        return nums;
    }
}