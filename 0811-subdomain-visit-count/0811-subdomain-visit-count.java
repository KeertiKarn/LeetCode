class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
     List<String> ans= new ArrayList<>();
     HashMap<String,Integer> map= new HashMap<>();
     for(int i=0;i<cpdomains.length;i++){
        String s= cpdomains[i];
        String[] parts= s.split(" ");
        String count= parts[0];
        String domain= parts[1];
        String[] sub= domain.split("\\.");
        int num=  Integer.parseInt(count);
        
       if(map.containsKey(sub[sub.length-1])) map.put(sub[sub.length-1],map.get(sub[sub.length-1])+num);
       else map.put(sub[sub.length-1],num);
       
       String a= sub[sub.length-2]+"."+sub[sub.length-1];
       if(map.containsKey(a)) map.put(a,map.get(a)+num);
       else map.put(a,num);

       if(sub.length==3){
        String b= sub[sub.length-3]+"."+sub[sub.length-2]+"."+sub[sub.length-1];
        if(map.containsKey(b)) map.put(b,map.get(b)+num);
       else map.put(b,num);
       }
    }
    for(Map.Entry<String, Integer> entry: map.entrySet()) {
      String val= String.valueOf(entry.getValue());
      String d= entry.getKey();
      ans.add(val+" "+d);
    } 
    return ans;
    }
}