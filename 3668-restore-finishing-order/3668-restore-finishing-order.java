class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set= new HashSet<>();
        for(int ele:friends) set.add(ele);
        int k=0;
        for(int i=0;i<order.length;i++){
            if(set.contains(order[i])){
                friends[k++]=order[i];
            }
        }
        return friends;
    }
}