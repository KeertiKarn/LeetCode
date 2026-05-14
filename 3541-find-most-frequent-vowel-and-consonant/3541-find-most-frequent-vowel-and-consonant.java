class Solution {
    public int maxFreqSum(String s) {
        int[] freq= new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int cons=0;
        int vow=0;
        for(int i=0;i<freq.length;i++){
            if(i==0  || i==4 || i==8 || i==14 || i==20){
                vow= Math.max(vow,freq[i]);
            }
            else cons= Math.max(cons,freq[i]);
        }
        return cons+vow;
    }
}