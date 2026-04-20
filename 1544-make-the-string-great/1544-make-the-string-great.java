class Solution {
    public String makeGood(String s) {
       Stack<Character> st= new Stack<>();
       for(int i=0;i<s.length();i++){
        if(!st.isEmpty() && st.peek()!=s.charAt(i) && Character.toLowerCase(st.peek()) == Character.toLowerCase(s.charAt(i))) st.pop();
        else st.push(s.charAt(i));
       }
        if(st.isEmpty()) return "";
        StringBuilder ans= new StringBuilder();
        while(!st.isEmpty()) ans.append(st.pop());
        return ans.reverse().toString();
    }
}