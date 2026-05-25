class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        StringBuilder sb= new StringBuilder();
        sb.append(s);
        while(i<j){
            while(i<sb.length() && !Character.isLetter(sb.charAt(i))) i++;
            while(j>=0 && !Character.isLetter(sb.charAt(j))) j--;
            if(i<j){
            char ch= sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,ch);
            i++;
            j--;
            }
        }
        return sb.toString();
    }
}