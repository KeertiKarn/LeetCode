class Solution {
    public int maxVowels(String s, int k) {
       int start=0;
       int vowel= 0;
       int ans=0;
       for(int end=0;end<k;end++){
         if(isvowel(s.charAt(end))) vowel++;
       } 
       ans= Math.max(0,vowel);
       int end=k;
       while(end<s.length()){
        if(isvowel(s.charAt(end))) vowel++;
        if(isvowel(s.charAt(start))) vowel--;
        start++;
        end++;
        ans= Math.max(ans,vowel);
       }
       return ans;
    }
    public boolean isvowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}