class Solution {
    public int[] sortByBits(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int count=0;
            int ele=arr[i];
            while(ele>0){
              if(ele%2==1) count++;
              ele/=2;
            }
            map.put(arr[i],count);
        }
        Integer[] temp= new Integer[arr.length];
        for (int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp,(a,b)->{
            if (!map.get(a).equals(map.get(b))) {
                return Integer.compare(map.get(a), map.get(b));
            }
            return Integer.compare(a, b);
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }
}