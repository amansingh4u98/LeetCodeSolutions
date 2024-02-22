class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustcount = new int[n + 1];

        for (int[] relation : trust) {
            trustcount[relation[0]]--;
            trustcount[relation[1]]++;
        }

        for (int i = 1; i <= n; ++i) {
            if (trustcount[i] == n - 1) {
                return i;
            }
        }

        return -1; // no judge found
    }
}