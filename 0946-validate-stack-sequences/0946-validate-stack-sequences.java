class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st= new Stack<>();
        int i=0;
        int j=0;
        while( j<popped.length){
            if(!st.isEmpty() && popped[j]==st.peek()) {
                st.pop();
                j++;
            }
            else{
                if(i<pushed.length){
                st.push(pushed[i]);
                i++;
                }
                else return false;
            }
        }
        return true;
       
    }
}