class Solution {
    public int maxDepth(String s) {
        Stack<Character> st= new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(') st.push(ch);
            else if(ch==')'){
                count=Math.max(count,st.size());
                st.pop();
            }
        }
        return count;
    }
}