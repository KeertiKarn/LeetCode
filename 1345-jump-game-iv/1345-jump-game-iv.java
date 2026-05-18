class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        // value -> list of indices
        for(int i = 0; i < n; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], new ArrayList<>());
            }
            map.get(arr[i]).add(i);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.add(0);
        visited[0] = true;

        int steps = 0;

        while(!q.isEmpty()) {

            int size = q.size();

            for(int i = 0; i < size; i++) {

                int curr = q.remove();

                // reached last index
                if(curr == n - 1) {
                    return steps;
                }

                int left = curr - 1;
                int right = curr + 1;

                // left jump
                if(left >= 0 && !visited[left]) {
                    q.add(left);
                    visited[left] = true;
                }

                // right jump
                if(right < n && !visited[right]) {
                    q.add(right);
                    visited[right] = true;
                }

                // same value jumps
                if(map.containsKey(arr[curr])) {
                    for(int idx : map.get(arr[curr])) {

                        if(!visited[idx]) {
                            q.add(idx);
                            visited[idx] = true;
                        }
                    }

                    // remove processed group
                    map.remove(arr[curr]);
                }
            }

            steps++;
        }

        return -1;

    }
}