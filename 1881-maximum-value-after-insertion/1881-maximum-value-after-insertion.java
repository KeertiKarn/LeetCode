class Solution {
    public String maxValue(String n, int x) {
        boolean neg = false;
        if(n.charAt(0)=='-') neg= true;
        int i=0;
        StringBuilder ans= new StringBuilder();
        if(!neg){
           while(i<n.length() && n.charAt(i)-'0'>=x) {
            ans.append(n.charAt(i));
            i++;
           }
           ans.append(x);
           ans.append(n.substring(i));
        }
        else{
            i=1;
            ans.append('-');
            while(i<n.length() && n.charAt(i)-'0'<=x) {
            ans.append(n.charAt(i));
            i++;
           }
           ans.append(x);
           ans.append(n.substring(i)); 
        }
        return ans.toString();
    }
}