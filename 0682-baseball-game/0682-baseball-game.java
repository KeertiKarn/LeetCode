class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<operations.length;i++){
            String ch= operations[i];
             if(ch.equals("+")){
                int prev1= st.pop();
                int prev2= st.pop();
                st.push(prev2);
                st.push(prev1);
                st.push(prev1+prev2);
            }
            else if(ch.equals("D")){
                int temp=st.peek();
                st.push(2*temp);
            }
            else if(ch.equals("C")) st.pop();
            else  st.push(Integer.parseInt(ch));
        }
        int sum=0;
        while(!st.isEmpty()) sum+=st.pop();
        return sum;
    }
}