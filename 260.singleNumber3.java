class Solution {
    public int[] singleNumber(int[] nums) {
        long xor_r = 0;

        // Perform XOR for all elements to find xor_r
        for (int num : nums) {
            xor_r ^= num;
        }

        // Find the rightmost set bit (mask)
        long mask = xor_r & (-xor_r);

        int groupa = 0;
        int groupb = 0;

        // Divide the numbers into two groups and perform XOR in each group
        for (int num : nums) {
            if ((num & mask) != 0) {
                groupa ^= num;
            } else {
                groupb ^= num;
            }
        }

        // Return the two unique numbers
        return new int[]{groupa, groupb};
    }
}