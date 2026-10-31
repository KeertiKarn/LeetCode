class Solution {
    public String firstPalindrome(String[] words) {
        for(String ele:words){
            if(ispalindrome(ele)) return ele;
        }
        return "";
    }
    public boolean ispalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}