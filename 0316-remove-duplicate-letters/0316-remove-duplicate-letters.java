class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        HashSet<Character> set= new HashSet<>();
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
              if (set.contains(s.charAt(i))) continue;
            while(!st.isEmpty() && st.peek()>s.charAt(i) && map.get(st.peek())>i){
                set.remove(st.pop());
            }
            if(!set.contains(s.charAt(i))){
                st.push(s.charAt(i));
                set.add(s.charAt(i));
            }
        }
        StringBuilder ans= new StringBuilder();
        while(!st.isEmpty()) ans.append(st.pop());
        return ans.reverse().toString();
    }
}