class Solution {
    public int countKthRoots(int l, int r, int k) {
     if (k == 1) return r - l + 1;
     ArrayList<Integer> arr= new ArrayList<>();
     int num=1;
     while(true){
        int last=(int)Math.pow(num,k);
        if(last>r) break;
        arr.add(last);
        num++;
     }
     int i=0;
     while(i<arr.size() && arr.get(i)<l){
        i++;
     }
     if(l==0) return arr.size()+1;
     return arr.size()-i;
    }
}