class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        ans[0] = 1;
        //storing the left products
        for(int i=1; i<n; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        int right = nums[n-1];
        for(int i=n-2; i>=0; i--){
            ans[i] *= right;
            right *= nums[i];
        }
        return ans;
    }
}