class Solution {
    public String interpret(String command) {
        StringBuilder ans= new StringBuilder();
        int i=0;
        while(i<command.length()){
            char ch= command.charAt(i);
            if(ch=='G'){
                ans.append(ch);
                i++;
            }
            else if(i<command.length()-1 && ch=='('){
                char temp= command.charAt(i+1);
                if(temp==')'){
                    ans.append('o');
                    i+=2;
                }
                else{
                    ans.append('a').append('l');
                    i+=4;
                }
            }
        }
        return ans.toString();
    }
}