class Solution {
    public int minAddToMakeValid(String s) {
        int openNeeded = 0;
        int closeNeeded = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                openNeeded++;
            } else { // c == ')'
                if (openNeeded > 0) {
                    openNeeded--; // Matched with an existing '('
                } else {
                    closeNeeded++; // Unmatched ')'
                }
            }
        }

        return openNeeded + closeNeeded;
    }
}