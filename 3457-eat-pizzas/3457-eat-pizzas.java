class Solution {
    public long maxWeight(int[] pizzas) {
        Arrays.sort(pizzas);
        
        int n = pizzas.length;
        int k = n / 4;
        
        int oddDays = (k + 1) / 2;
        int evenDays = k / 2;
        
        long ans = 0;
        
        int i = n - 1;
        
        // Step 1: take largest for odd days
        for (int j = 0; j < oddDays; j++) {
            ans += pizzas[i--];
        }
        
        // Step 2: take second largest for even days
        for (int j = 0; j < evenDays; j++) {
            i--; // skip one (largest)
            ans += pizzas[i--]; // take next
        }
        
        return ans;
    }
}