class Solution {
    public int balancedStringSplit(String s) {
        int countR=0;
        int countL=0;
        int i=0;
        int ans=0;
        while(i<s.length()){
            if(s.charAt(i)=='R') countR++;
            else countL++;
            if(countR==countL) ans++;
            i++;
        }
        return ans;
    }
}