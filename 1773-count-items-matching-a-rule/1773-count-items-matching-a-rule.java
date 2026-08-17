class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(int i=0;i<items.size();i++){
            List<String> temp= items.get(i);
            if(ruleKey.equals("type")){
                String val=temp.get(0);
                if(val.equals(ruleValue))  count++;
            }
            else if(ruleKey.equals("color")){
                String val= temp.get(1);
                if(val.equals(ruleValue)) count++;
            }
            else if(ruleKey.equals("name")){
                String val= temp.get(2);
                if(val.equals(ruleValue)) count++;
            }
        }
        return count;
    }
}