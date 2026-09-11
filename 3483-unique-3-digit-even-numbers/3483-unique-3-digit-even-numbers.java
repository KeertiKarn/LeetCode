class Solution {
    public int totalNumbers(int[] digits) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int ele: digits){
            if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
            else map.put(ele,1);
        }
        int count=0;
        for(int i=100;i<1000;i+=2){
           int d1=i/100;
           int d2=(i/10)%10;
           int d3=i%10;
           if (map.containsKey(d1) && map.containsKey(d2) && map.containsKey(d3)) {
           map.put(d1,map.get(d1)-1);
           map.put(d2,map.get(d2)-1);
           map.put(d3,map.get(d3)-1);
           if(map.get(d1)>=0 && map.get(d2)>=0 && map.get(d3)>=0) count++;
            
           map.put(d1,map.get(d1)+1);
           map.put(d2,map.get(d2)+1);
           map.put(d3,map.get(d3)+1);
           
        }
        }
        return count;
    }
}