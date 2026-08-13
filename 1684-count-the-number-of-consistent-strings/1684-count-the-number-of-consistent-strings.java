class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set= new HashSet<>();
        for(int i=0;i<allowed.length();i++) set.add(allowed.charAt(i));
        int count=0;
        for(int i=0;i<words.length;i++){
            String s= words[i];
            boolean good=true;
            for(int j=0;j<s.length();j++){
               if(!set.contains(s.charAt(j))){
                good=false;
                break;
               }
            }
            if(good) count++;
        }
        return count;
    }
}