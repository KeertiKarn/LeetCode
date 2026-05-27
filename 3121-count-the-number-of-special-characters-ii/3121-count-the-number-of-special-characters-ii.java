class Solution {
    public int numberOfSpecialChars(String word){
        HashMap<Character,Integer> map= new HashMap<>();
        int count=0;
        for(int i=0;i<word.length();i++){
            //last occurance of lowercase
            if(Character.isLowerCase(word.charAt(i))) map.put(word.charAt(i),i);
            else{
                //first occurance of uppercase
                if(!map.containsKey(word.charAt(i))) map.put(word.charAt(i),i);
            }
        }
        for(char key: map.keySet()){
            int val = (int)key;
            //for lowercase
            if(Character.isLowerCase(key)){
                int l= map.get(key);
                if(map.containsKey((char)(val-32)) && map.get((char)(val-32))>l) count++;
            }
        }
        return count;
    }
}