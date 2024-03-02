class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = nums[i] * nums[i];
        }
        int start = 0, end = n - 1, ind = n - 1;
        while (start <= end && ind >= 0) {
            if (temp[start] >= temp[end]) {
                ans[ind--] = temp[start++];
            } else {
                ans[ind--] = temp[end--];
            }
        }
        return ans;
    }
}