class Pair{
    int health;
    int pos;
    char dir;
    int idx;
    Pair(int pos,char dir,int health,int idx){
        this.pos=pos;
        this.dir=dir;
        this.health=health;
        this.idx=idx;
    }
}

class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        Pair[] arr= new Pair[positions.length];
        for(int i=0;i<positions.length;i++){
            arr[i]= new Pair(positions[i],directions.charAt(i),healths[i],i);
        }

        Arrays.sort(arr,(a,b)->a.pos-b.pos);

        Stack<Pair> st= new Stack<>();
        for(Pair curr: arr){
            boolean alive= true;
            while(!st.isEmpty() && st.peek().dir=='R' && curr.dir=='L'){
              if(st.peek().health<curr.health){
                st.pop();
                curr.health--;
              }
              else if(st.peek().health==curr.health){
                st.pop();
                alive=false;
                break;
              }
              else {
                st.peek().health--;   
                alive =false; 
                break;
                }
            }
            if(alive) st.push(curr);
        }
       List<Pair> survivors = new ArrayList<>(st);
       Collections.sort(survivors,(a,b)->a.idx-b.idx); 
       List<Integer> ans= new ArrayList<>(); 
        for(int i=0;i<survivors.size();i++){
           ans.add(survivors.get(i).health);
        }
        return ans;
    }
}