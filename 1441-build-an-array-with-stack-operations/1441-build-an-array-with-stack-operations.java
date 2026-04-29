class Solution {
    public List<String> buildArray(int[] target, int n) {
       List<String> ans= new ArrayList<>();
       int j=0;
       for(int i=1;i<=target[target.length-1];i++){
         if(j<target.length && target[j]==i){
             ans.add("Push");
             j++;
         }
         else {
            ans.add("Push");
            ans.add("Pop");
         }
       }
       return ans;
    }
}