class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st1= new Stack<>();
        Stack<Integer> st2= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='(') st1.push(i);
            else if(ch==')'){
                if(!st1.isEmpty()) st1.pop();
                else if(!st2.isEmpty()) st2.pop();
                else return false;
            }
            else st2.push(i);
        }
        while(!st1.isEmpty() && !st2.isEmpty()){
          if(st1.peek()<st2.peek()){  //"(" comes before *
             st1.pop();
             st2.pop();
          }
          else return false;
        }
        return st1.isEmpty();
    }
}