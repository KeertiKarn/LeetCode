class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder ans= new StringBuilder();
        int i=0;
        while(i<s.length()){
            int count=0;
            StringBuilder temp= new StringBuilder();
            while(i<s.length() && count<k){
              temp.append(s.charAt(i));
              i++;
              count++;
            }
            temp=temp.reverse();
            ans.append(temp);
            count=0;
            while(i<s.length() && count<k){
                ans.append(s.charAt(i));
                i++;
                count++;
            }
        }
        return ans.toString();
    }
}