class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map= new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            List<String> temp= knowledge.get(i);
            map.put(temp.get(0),temp.get(1));
        }
        StringBuilder ans= new StringBuilder();
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(ch=='('){
                StringBuilder sb= new StringBuilder();
                i++;
                while(i<s.length() && s.charAt(i)!=')'){
                     sb.append(s.charAt(i));
                     i++;
                }
                if(map.containsKey(sb.toString())) ans.append(map.get(sb.toString()));
                else ans.append("?");
            }
            else ans.append(ch);
            i++;
        }
        return ans.toString();
    }
}