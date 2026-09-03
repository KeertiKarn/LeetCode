class TimeMap {
    HashMap<String,ArrayList<ArrayList<String>>> map;
    public TimeMap() {
        map= new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        ArrayList<String> temp= new ArrayList<>();
        temp.add(value);
        temp.add(String.valueOf(timestamp));
        if(map.containsKey(key)){
            ArrayList<ArrayList<String>> arr= map.get(key);
            arr.add(temp);
            map.put(key,arr);
        }
        else{
            ArrayList<ArrayList<String>> arr= new ArrayList<>();
            arr.add(temp);
            map.put(key,arr);
        }
       
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        ArrayList<ArrayList<String>> list= map.get(key);
        int n=list.size();
        if(n==0) return "";
        int low=0;
        int high=n-1;
        String ans="";
        while(low<=high){
            int mid=low+(high-low)/2;
            int val=Integer.parseInt(list.get(mid).get(1));
            if(val==timestamp) return list.get(mid).get(0);
            if(val>timestamp) high=mid-1;
            else{
                ans=list.get(mid).get(0);
                low=mid+1;
            }
        }
        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */