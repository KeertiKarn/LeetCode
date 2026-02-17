class Solution {
    public int maxProduct(String[] words) {
        int ans= 0;
      for(int i=0;i<words.length-1;i++){
        for(int j=i+1;j<words.length;j++){
            int temp= words[i].length()*words[j].length();
            if(temp>ans && dontshare(words[i],words[j])) ans=temp;
        }
      }  
      return ans;
    }
    public boolean dontshare(String a,String b){
        HashSet<Character> set= new HashSet<>();
        if(b.length()>a.length()){
            for(int i=0;i<b.length();i++)    set.add(b.charAt(i));
            for(int i=0;i<a.length();i++){
                if(set.contains(a.charAt(i))) return false;
            }
            }
        else{
            for(int i=0;i<a.length();i++)    set.add(a.charAt(i));
            for(int i=0;i<b.length();i++){
                if(set.contains(b.charAt(i))) return false;
            }
        }
        return true;
    }
}