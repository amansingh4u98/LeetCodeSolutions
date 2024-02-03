class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        Integer[][] dp = new Integer[n][amount+1];
        for(int t=0; t<=amount; t++){
            if(t % coins[0] == 0)
                dp[0][t] = 1;
            else
                dp[0][t] = 0;
        }
        for(int i=1; i<n; i++){
            for(int t=0; t<=amount; t++){
               int notTake = dp[i-1][t];
                int take = 0;
                if(coins[i] <= t)
                    take = dp[i][t-coins[i]];

              dp[i][t] = take + notTake; 
            }
        }
        return dp[n-1][amount];
    }
    // memoization
    public int solve(int i, int t, int[] arr, Integer[][] dp){
        if(i == 0){
            if(t % arr[0] == 0)
                return 1;
            return 0;
        }
        if(dp[i][t] != null){
            return dp[i][t];
        }

        int notTake = solve(i-1, t, arr, dp);
        int take = 0;
        if(arr[i] <= t)
            take = solve(i, t-arr[i], arr, dp);

        return dp[i][t] = take + notTake;
    }
}