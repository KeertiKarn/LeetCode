class Solution {
    public boolean closeStrings(String word1, String word2) {
     if(word1.length()!=word2.length()) return false;
     HashSet<Character> set= new HashSet<>();
     HashMap<Character,Integer> map1= new HashMap<>();
     HashMap<Character,Integer> map2= new HashMap<>();
     for(int i=0;i<word1.length();i++){
        char ch= word1.charAt(i);
        set.add(ch);
        if(map1.containsKey(ch)) map1.put(ch,map1.get(ch)+1);
        else map1.put(ch,1);
     }   
     for(int i=0;i<word2.length();i++) {
        char ch= word2.charAt(i);
        if(!set.contains(ch)) return false;
        if(map2.containsKey(ch)) map2.put(ch,map2.get(ch)+1);
        else map2.put(ch,1);
     }
     List<Integer> values1 = new ArrayList<>(map1.values());
    List<Integer> values2 = new ArrayList<>(map2.values());
    Collections.sort(values1);
    Collections.sort(values2);
       return values1.equals(values2);
    
    }
}