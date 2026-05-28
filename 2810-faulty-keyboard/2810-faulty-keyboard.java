class Solution {
    public String finalString(String s) {
        StringBuilder sb= new StringBuilder();
        for(int x=0;x<s.length();x++){
            if(s.charAt(x)=='i') sb.reverse();
             else sb.append(s.charAt(x));
            }
                return sb.toString();
        }
   
    }
