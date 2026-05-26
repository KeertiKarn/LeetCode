class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set= new HashSet<>();
        int count=0;
        for(int i=0;i<word.length();i++) set.add(word.charAt(i));
        for(int i=0;i<word.length();i++){
            int val = (int)word.charAt(i);
            if(val<=97 && val<=122){
                if(set.contains((char)(val+32))){
                    count++;
                    set.remove((char)(val+32));
                }
            }
        }
        return count;
    }
}