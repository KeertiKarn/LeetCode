class Solution {
    public int distributeCandies(int[] candyType) {
      HashSet<Integer> set= new HashSet<>();
      for(int ele:candyType) set.add(ele);
      return Math.min(set.size(),candyType.length/2);  
    }
}