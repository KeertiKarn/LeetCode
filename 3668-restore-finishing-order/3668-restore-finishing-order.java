class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashMap<Integer,Integer> map= new HashMap<>();
        //Arrays.sort works with Integer array not int
        Integer[] temp= new Integer[friends.length];
        for(int i=0;i<friends.length;i++) temp[i]=friends[i];
        for(int i=0;i<order.length;i++) map.put(order[i],i);
        Arrays.sort(temp,(a,b)->{
            return map.get(a)-map.get(b);
        });
        for(int i=0;i<friends.length;i++) friends[i]=temp[i];
        return friends;
    }
}