class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(a.getValue(), b.getValue()));

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            pq.add(m);

            if (pq.size() > k) {
                pq.poll();
            }

        }

        int[] ans = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {

            ans[i++] = pq.poll().getKey();
        }

        return ans;
    }
}
