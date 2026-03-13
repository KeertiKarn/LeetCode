class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<asteroids.length;i++){
             boolean alive= true;
            while(!st.isEmpty() && st.peek()>0 && asteroids[i]<0){
              if(st.peek()<Math.abs(asteroids[i])) {
                st.pop();
              }
             else  if(st.peek()==Math.abs(asteroids[i])){
                st.pop();
                 alive=false;
                 break;
             }
            else {
                alive= false; 
                break;
            }
        }
         if(alive) st.push(asteroids[i]);
        }
        int[] ans= new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}