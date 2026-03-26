class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<num.length() ;i++){
            int temp= num.charAt(i)-'0';
            while(!st.isEmpty() && st.peek()>temp &&k>0){
                st.pop();
                k--;
               
            }
            st.push(temp);
        }
        while(k>0){
            st.pop();
            k--;
        }

        StringBuilder sb= new StringBuilder();
        while(!st.isEmpty()) sb.append(st.pop());
        String ans= sb.reverse().toString();
        int i=0;
        while(i<ans.length() && ans.charAt(i)=='0') i++;
        ans= ans.substring(i);
        if(ans.length()==0) return "0";
        return ans;
    }
}