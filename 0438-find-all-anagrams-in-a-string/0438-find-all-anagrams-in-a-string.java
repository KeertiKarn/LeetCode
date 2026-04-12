class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length() < p.length()) return new ArrayList<>();
        int[] pcount= new int[26];
        int[] scount= new int[26];
        List<Integer> ans= new ArrayList<>();
        for(int i=0;i<p.length();i++) pcount[p.charAt(i)-'a']++;
        for(int i=0;i<p.length();i++) scount[s.charAt(i)-'a']++;
        if(Arrays.equals(scount,pcount)) ans.add(0);
        int start=0;
        for(int i=p.length();i<s.length();i++){
            scount[s.charAt(i)-'a']++;
            scount[s.charAt(start)-'a']--;
            start++;
            if(Arrays.equals(scount,pcount)) ans.add(start);
        }
        return ans;
    }
}