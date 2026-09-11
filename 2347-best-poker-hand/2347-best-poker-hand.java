class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        char ch=suits[0];
        boolean same=true;
        for(int i=1;i<suits.length;i++){
            if(ch!=suits[i]){
                same=false;
                break;
            }
        }
        if(same) return "Flush";
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int ele: ranks){
            if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
            else map.put(ele,1);
        }
        int maxfreq=0;
        for(int key: map.keySet()){
              maxfreq= Math.max(maxfreq,map.get(key));
        }
        if(maxfreq>=3) return "Three of a Kind";
        if(maxfreq>=2) return "Pair";
        return "High Card";
    }
}