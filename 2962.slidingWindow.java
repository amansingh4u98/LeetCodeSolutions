class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int n = nums.length, l = 0, r = 0;
        int maxCnt = 0;
        long res = 0;
        while(r<n){
            if(nums[r] == max)
                maxCnt++;
            while(maxCnt >= k){ // this is the main idea to add subarrays from starting till the end
                res += n-r;

                if(nums[l] == max){
                    maxCnt--;
                }
                l++;
            } 
            r++;
        }
        return res;
    }
}