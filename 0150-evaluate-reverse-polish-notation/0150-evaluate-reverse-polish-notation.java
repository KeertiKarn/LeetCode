class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st= new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String ch= tokens[i];
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
                int val2= Integer.parseInt(st.pop());
                int val1= Integer.parseInt(st.pop());
                int result=0;
                if(ch.equals("+")) result= val1+val2;
                else if(ch.equals("-")) result= val1-val2;
                else if(ch.equals("*")) result= val1*val2;
                else if(ch.equals("/")) result= val1/val2;
                st.push(String.valueOf(result));
            }
            else st.push(ch);
        } 
        int ans= Integer.parseInt(st.pop());
        return ans;
    }
}