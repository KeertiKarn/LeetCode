class Solution {
    public char processStr(String s, long k) {
        long length = 0;
        // Compute final length
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z') length++;
            else if(ch=='*'){
                if(length>0) length--;
            } 
            else if(ch=='#'){
                length*=2;
            }
            // '%' does not change length
        }

        if(k>=length) return '.';

        // Reverse process
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                if(k==length-1){
                    return ch;
                }
                length--;
            }
            else if(ch=='*'){
                length++;
            }
            else if(ch=='#'){
                length/=2;
                if(length>0){
                    k %= length;
                }
            }
            else{ // '%'
                k=length-1-k; //mirror image
            }
        }

        return '.';
    }
}