class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while(i<=j){
            if(!isVowel(s.charAt(i))) {
                sb.setCharAt(i,s.charAt(i));
                i++;
                }
            else if(!isVowel(s.charAt(j))) {
                sb.setCharAt(j,s.charAt(j));
                j--;
                }
            else{
                sb.setCharAt(i,s.charAt(j));
                sb.setCharAt(j,s.charAt(i));
                i++;
                j--;
            }
        }
        return sb.toString();
    }
    public boolean isVowel(Character ch){
        if(ch=='A' || ch=='a') return true;
        else if(ch=='E' || ch=='e') return true;
        else if(ch=='I' || ch=='i') return true;
        else if(ch=='O' || ch=='o') return true;
        else if(ch=='U' || ch=='u') return true;
        return false;
    }
}