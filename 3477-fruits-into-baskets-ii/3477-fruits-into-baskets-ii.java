class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<fruits.length;i++){
           for(int j=0;j<baskets.length;j++){
            if(!set.contains(j) && fruits[i]<=baskets[j]){
                set.add(j);
                break;
            }
           }
        }
        return fruits.length-set.size();
    }
}