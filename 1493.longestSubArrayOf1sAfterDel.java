class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int l = 0, r = 0;
        int maxSize = 0;
        int cnt = 0;
        while (r < n) {
            if (nums[r] == 0) {
                cnt++;
            }
            if (cnt > 1) {
                while (cnt > 1) {
                    if (nums[l] == 0) {
                        cnt--;
                    }
                    l++;
                }
            } else {
                maxSize = Math.max(maxSize, r - l);
            }
            r++;

        }
        return maxSize;
    }
}