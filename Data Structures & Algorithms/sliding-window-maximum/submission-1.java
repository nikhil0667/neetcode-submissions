class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0;
        int resultIndex = 0;

        int[] result = new int[nums.length - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int right = 0; right < nums.length; right++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[right]) {
                deque.pollLast();
            }

            deque.addLast(right);

            if (deque.peekFirst() < left) {
                deque.pollFirst();
            }

            if (right - left + 1 == k) {
                result[resultIndex++] = nums[deque.peekFirst()];

                left++;
            }
        }

        return result;
    }
}
