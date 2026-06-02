class Pair{
    int val;
    char ch;
    Pair(char ch,int val){
        this.ch=ch;
        this.val=val;
    }
}

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(!st.isEmpty() && st.peek().ch==ch){
              st.push(new Pair(ch,st.peek().val+1));
            }
            else st.push(new Pair(ch,1));
            if(st.peek().val==k){
                for(int j=0;j<k;j++) st.pop();
            }
        }
        StringBuilder ans= new StringBuilder();
        while(!st.isEmpty()) ans.append(st.pop().ch);
        return ans.reverse().toString();
    }
}