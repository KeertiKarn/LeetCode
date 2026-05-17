class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st= new Stack<>();
        for(int i=0;i<nums.length;i++){
            long curr = nums[i];
            while(!st.isEmpty() && st.peek()==curr){
                curr+=st.pop();
            }
             st.push(curr);
        }
        List<Long> result= new ArrayList<>();
        while(!st.isEmpty()){
            result.add(st.pop());
        }
        Collections.reverse(result);
        return result;
    }
}