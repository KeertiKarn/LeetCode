class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> arr= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))) arr.add(s.charAt(i));
        }
        Collections.sort(arr);
        int idx=0;
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                ans.append(arr.get(idx));
                idx++;
            }
            else ans.append(s.charAt(i));
        }
        return ans.toString();
    }
    public boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return true; 
        return ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}