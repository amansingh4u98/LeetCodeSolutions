class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        int ans = 0;
        int val = tickets[k];
        for(int i=0; i<n; i++){
            if(i <= k){
                int min = Math.min(val, tickets[i]);
                ans += min;
                tickets[i] -= min;
            }
            else{
                int min = Math.min(val-1, tickets[i]);
                ans += min;
                tickets[i] -= min;
            }
        }
        return ans;
    }
}