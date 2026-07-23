class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int ele: arr){
            if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
            else map.put(ele,1);
        }
        int half= arr.length/4;
        for(int key:map.keySet()){
            if(map.get(key)>half) return key;
        }
        return -1;
    }
}