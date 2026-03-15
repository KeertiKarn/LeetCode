class Solution {
    public int precedence(Character ch){
        if(ch=='+' || ch=='-') return 1;
        if(ch=='*' || ch=='/') return 2;
        return 0;
    }
    public int calculate(String s) {
       Stack<Character> operator= new Stack<>();
       Stack<Integer> operands= new Stack<>();
       int i=0;
       while(i<s.length()){
        char ch=s.charAt(i);
        //digit
        if(Character.isDigit(s.charAt(i))){
          int num=0;
          while(i<s.length() && Character.isDigit(s.charAt(i))){
            num= num*10+ (s.charAt(i)-'0');
            i++;
          }
          operands.push(num);
        }
        //opening brackets
        else if(ch=='(') operator.push(ch);
        //operator
        else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
            while(!operator.isEmpty() && precedence(operator.peek())>=precedence(s.charAt(i))){
                    int val2= operands.pop();
                    int val1= operands.pop();
                    int result=0;
                    if(operator.peek()=='+') result= val1+val2;
                    else if(operator.peek()=='-') result= val1-val2;
                    else if(operator.peek()=='*') result= val1*val2;
                    else result= val1/val2;
                    operator.pop();
                    operands.push(result);
                 }
                operator.push(ch);
                i++;
        }
        else if(ch==')'){
            while(operator.peek()!='('){
                    int val2= operands.pop();
                    int val1= operands.pop();
                    int result=0;
                    if(operator.peek()=='+') result= val1+val2;
                    else if(operator.peek()=='-') result= val1-val2;
                    else if(operator.peek()=='*') result= val1*val2;
                    else result= val1/val2;
                    operator.pop();
                    operands.push(result);
            }
            operator.pop();
            i++;
           }
        else i++;
       } 

       while(!operator.isEmpty()){
           int val2= operands.pop();
           int val1= operands.pop();
           int result=0;
           if(operator.peek()=='+') result= val1+val2;
           else if(operator.peek()=='-') result= val1-val2;
           else if(operator.peek()=='*') result= val1*val2;
            else result= val1/val2;
           operator.pop();
         operands.push(result);
       }

       return operands.pop();
    }
}