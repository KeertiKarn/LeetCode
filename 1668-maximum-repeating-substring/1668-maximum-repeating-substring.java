class Solution {
    public int maxRepeating(String sequence, String word) {
        if(!sequence.contains(word)) return 0;
        StringBuilder ans= new StringBuilder();
        ans.append(word);
        int count=0;
        while(sequence.contains(ans)){
            count++;
            ans.append(word);
        }
        return count;
    }
}