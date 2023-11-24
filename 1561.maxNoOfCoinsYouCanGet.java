class Solution {
    public int maxCoins(int[] piles) {
        int ans = 0;
        Arrays.sort(piles);
        int n = piles.length;
        int i = 0, j = n-2;
        while(j>=i){
            ans += piles[j];
            i++;
            j -= 2;
        }
        return ans;
    }
}