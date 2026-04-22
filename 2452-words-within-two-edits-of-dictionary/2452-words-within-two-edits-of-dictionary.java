class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans= new ArrayList<>();
       for(int i=0;i<queries.length;i++){
        String temp= queries[i];
        for(int j=0;j<dictionary.length;j++){
         String com= dictionary[j];
         int x=0;
         int y=0;
         int count=0;
         while(x<com.length()){
           if(temp.charAt(x)!=com.charAt(y)) count++;
           x++;
           y++;
         }
         if(count<=2){
            ans.add(temp);
            break;
         }
        }
       }
       return ans;

    }
}