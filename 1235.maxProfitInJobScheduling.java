class Solution {
    class Job {
        int start;
        int end;
        int profit;

        public Job(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }

    private static int compareJobs(Job m, Job n) {
        return Integer.compare(m.end, n.end);
    }

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[] dp = new int[n];
        Job[] jobs = new Job[n];

        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }

        Arrays.sort(jobs, Comparator.comparingInt(j -> j.end));

        dp[0] = jobs[0].profit;

        for (int i = 1; i < n; i++) {
            int prev = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (jobs[i].start >= jobs[j].end) {
                    prev = dp[j];
                    break;
                }
            }
            dp[i] = Math.max(prev + jobs[i].profit, dp[i - 1]);
        }

        return dp[n - 1];
    }
}