class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq= new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        int f= freq[s.charAt(0)-'a'];
        for(int i=1;i<s.length();i++){
            if(freq[s.charAt(i)-'a']!=f) return false; 
        }
        return true;
    }
}