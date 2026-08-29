class Solution {
    public String removeOuterParentheses(String s) {
        int count=1;
        StringBuilder sb= new StringBuilder();
        for(int i=1;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='(') count++;
            else count--;
            if(count==0){
                i++;
                count=1;
            }
            else sb.append(ch);
        }
        return sb.toString();
    }
}