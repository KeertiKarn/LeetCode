class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int i=0;
        List<List<Integer>> ans= new ArrayList<>();
        while(i<s.length()){
          int count=0;
          char ch= s.charAt(i);
          int start=i;
          int j=i;
          while(j<s.length() && s.charAt(j)==ch){
            count++;
            j++;
          }
          if(count>=3){
            List<Integer> temp= new ArrayList<>();
            temp.add(start);
            temp.add(j-1);
            ans.add(temp);
          }
          i=j;
        }
        return ans;
    }
}