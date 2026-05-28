class Solution {
    public String finalString(String s) {
        StringBuilder sb= new StringBuilder();
        for(int x=0;x<s.length();x++){
            if(s.charAt(x)=='i'){
                int i=0;
                int j=sb.length()-1;
                while(i<j){
                    char temp= sb.charAt(i);
                    sb.setCharAt(i,sb.charAt(j));
                    sb.setCharAt(j,temp);
                    i++;
                    j--;

                }
            }
            else sb.append(s.charAt(x));
        }
        return sb.toString();
    }
}