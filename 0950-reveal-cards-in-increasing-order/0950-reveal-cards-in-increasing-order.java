class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] ans= new int[deck.length];
        Queue<Integer> queue= new LinkedList<>();
        for(int i=0;i<deck.length;i++) queue.add(i);
        int i=0;
        while(!queue.isEmpty()){
          ans[queue.remove()]=deck[i];
          i++;
          if(!queue.isEmpty()) queue.add(queue.remove());
        }
        return ans;
    }
}