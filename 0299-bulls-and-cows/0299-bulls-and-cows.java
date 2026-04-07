class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<secret.length();i++){
           if(map.containsKey(secret.charAt(i)))  map.put(secret.charAt(i),map.get(secret.charAt(i))+1);
           else map.put(secret.charAt(i),1);
        }
        int bulls=0;
        int cows=0;
        for(int i=0;i<guess.length();i++){
            if(guess.charAt(i)==secret.charAt(i)){
              bulls++;
              map.put(secret.charAt(i),map.get(secret.charAt(i))-1);
              if(map.get(secret.charAt(i))<=0) map.remove(secret.charAt(i));
            }
            else if(map.containsKey(guess.charAt(i))){
                cows++;
                map.put(guess.charAt(i),map.get(guess.charAt(i))-1);
                if(map.get(guess.charAt(i))<=0) map.remove(guess.charAt(i));
            }
        }
        return ""+bulls+"A"+cows+"B";
    }
}