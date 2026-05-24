class Solution {
    public int passwordStrength(String password) {
        int points=0;
      HashSet<Character> set= new HashSet<>();
      for(int i=0;i<password.length();i++){
        char ch= password.charAt(i);
        if(set.contains(ch)) continue;
        if(ch>='A' && ch<='Z') points+=2; 
        else if(ch>='a' && ch<='z') points+=1;
        else if(Character.isDigit(ch)) points+=3;
        else points+=5;
        set.add(ch);
      }  
      return points;
    }
}