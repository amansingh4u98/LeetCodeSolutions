//Approach-2 (How to find sorted subarray sums using Heap)
//T.C : O(n^2 *n logn)
//S.C : O(n)
class Solution {
    private static final int M = (int)1e9 + 7;

    public int rangeSum(int[] nums, int n, int left, int right) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        // Initialize the priority queue with the initial subarray sums
        for (int i = 0; i < n; i++) {
            pq.add(new int[]{nums[i], i});
        }

        int result = 0;

        for (int i = 1; i <= right; i++) {
            int[] current = pq.poll();

            // If the current index is within the desired range, add the value to the result
            if (i >= left) {
                result = (result + current[0]) % M;
            }

            // If index is less than the last index, increment it and add the new subarray sum to the queue
            if (current[1] < n - 1) {
                pq.add(new int[]{current[0] + nums[current[1] + 1], current[1] + 1});
            }
        }
        return result;
    }
}