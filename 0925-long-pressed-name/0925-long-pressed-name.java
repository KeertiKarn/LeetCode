class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.charAt(0)!=typed.charAt(0)) return false;
        int i=1;
        int j=1;
        char prev= name.charAt(0);
        while(j<typed.length()){
          if(i<name.length() && name.charAt(i)==typed.charAt(j)){
            prev=name.charAt(i);
            i++;
            j++;
          }
          else if(j<typed.length() && typed.charAt(j)==prev){
            while(j<typed.length() && typed.charAt(j)==prev) j++;
          }
          else return false;
        }
        return i>=name.length();
    }
}