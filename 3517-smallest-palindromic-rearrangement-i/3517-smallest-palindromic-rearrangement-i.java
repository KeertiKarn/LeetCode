class Solution {
    public String smallestPalindrome(String s) {
       int[] freq= new int[26];
       for(int i=0;i<s.length();i++){
        char ch= s.charAt(i);
        freq[ch-'a']++;
       }
       StringBuilder sb= new StringBuilder();
       char middle='@';
       for(int i=0;i<26;i++){
        char ch= (char)('a'+i);
        for(int j=0;j<freq[i]/2;j++) sb.append(ch);
        if(freq[i]%2==1) middle=ch;
       }
       StringBuilder second= new StringBuilder();
       second.append(sb);
       if(middle!='@') sb.append(middle);
       sb.append(second.reverse());
       return sb.toString();
    }
}