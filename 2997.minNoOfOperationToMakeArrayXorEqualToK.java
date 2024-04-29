class Solution {
    public int minOperations(int[] nums, int k) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        
        // Check if xor of elements is already k
        if (xor == k) {
            return 0;
        }
        
        // If not, find the xor of elements and k
        int target = xor ^ k;
        
        return Integer.bitCount(target);
    }
}