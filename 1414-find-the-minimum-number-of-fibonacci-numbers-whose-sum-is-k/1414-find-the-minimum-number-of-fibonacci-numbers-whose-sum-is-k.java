class Solution {
    public int findMinFibonacciNumbers(int k) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        while(true){
            int size=list.size();
            int next=list.get(size-1)+list.get(size-2);
            if(next==k) return 1;
            if(next>k) break;
            list.add(next);
        }
        int count=0;
        int i=list.size()-1;

        while(k>0){
            if(list.get(i)<=k){
                k-=list.get(i);
                count++;
            } else{
                i--;
            }
        }

        return count;
    }
}