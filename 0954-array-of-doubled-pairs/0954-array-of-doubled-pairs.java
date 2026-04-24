class Solution {
    public boolean canReorderDoubled(int[] arr) {
       HashMap<Integer,Integer> map= new HashMap<>();
       for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i])+1);
        else map.put(arr[i],1);
       } 
       Arrays.sort(arr);
       int i=0;
       while(i<arr.length && !map.isEmpty()){
        if(map.containsKey(arr[i])){
        //extract the element
        int ele= arr[i];
        int freq= map.get(arr[i]);
        map.put(ele,freq-1);
        if(map.get(ele)==0) map.remove(ele);
        //check for double or half
        if(ele<0){
            if(ele%2!=0) return false;
            int half= ele/2;
            if(!map.containsKey(half)) return false;
            int f= map.get(half);
            map.put(half,f-1);
           if(map.get(half)==0) map.remove(half);
        }
        else{
            int twice= ele*2;
            if(!map.containsKey(twice)) return false;
            int f= map.get(twice);
            map.put(twice,f-1);
           if(map.get(twice)==0) map.remove(twice);
        }
        }
        i++;
       }
         return map.isEmpty();
    }
}