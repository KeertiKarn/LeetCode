class Solution {
    public int numPairsDivisibleBy60(int[] time) {
     HashMap<Integer,Integer> map = new HashMap<>();
     int count=0;
     for(int temp : time){
        int rem = temp%60;
        int comp= (60-rem)%60;
        if(map.containsKey(comp)) count+=map.get(comp);
        if(map.containsKey(rem)) map.put(rem,map.get(rem)+1);
        else map.put(rem,1);
        
     }
     return count;
    }
}