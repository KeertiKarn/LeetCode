class Solution {
    public int[] finalPrices(int[] prices) {
        int[] result= new int[prices.length];
        Stack<Integer> st= new Stack<>();
        int j=prices.length-1;
        while(j>=0){
            int discount=0;
            while(!st.isEmpty() && st.peek()>prices[j]) st.pop();
            if(!st.isEmpty()) discount=st.peek();
            result[j]=prices[j]-discount;
            st.push(prices[j]);
            j--;
        }
        return result;
    }
}