class Solution {
    public int uniqueMorseRepresentations(String[] words) {
         String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."
        };
        HashSet<String> set=new HashSet<>();
        for(String ele: words){
            StringBuilder ans= new StringBuilder();
            for(int i=0;i<ele.length();i++) ans.append(morse[ele.charAt(i)-'a']);
            set.add(ans.toString());
        }
        return set.size();
    }
}