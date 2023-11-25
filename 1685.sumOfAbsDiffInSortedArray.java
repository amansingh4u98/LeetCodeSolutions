class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
       int n = nums.length;
       int[] res = new int[n];
       int sum = 0;
       for(int x : nums){
           sum += x;
       }
       int prefixSum = 0, suffixSum = sum;
       for(int i=0; i<n; i++){
           suffixSum -= nums[i];
           res[i] = (int)Math.abs(nums[i]*(n-i-1) - suffixSum) + (int) Math.abs(i*nums[i] - prefixSum);
           prefixSum += nums[i];
       }
       return res; 
    }
}