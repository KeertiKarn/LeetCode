class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int[] freq = new int[]{a, b, c};

        PriorityQueue<Character> pq = new PriorityQueue<>(
            (x, y) -> freq[y - 'a'] - freq[x - 'a'] // max heap by freq
        );

        for (int i = 0; i < 3; i++) {
            if (freq[i] > 0) {
                pq.add((char)(i + 'a'));
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!pq.isEmpty()) {
            char ch = pq.poll();

            int len = ans.length();

            // ❗ check last two chars
            if (len >= 2 && ans.charAt(len - 1) == ch && ans.charAt(len - 2) == ch) {
                if (pq.isEmpty()) break;

                char next = pq.poll();
                ans.append(next);
                freq[next - 'a']--;

                if (freq[next - 'a'] > 0) pq.add(next);
                pq.add(ch); // push ch back

                continue;
            }

            // otherwise safe to use
            ans.append(ch);
            freq[ch - 'a']--;

            if (freq[ch - 'a'] > 0) pq.add(ch);
        }

        return ans.toString();
    }
}