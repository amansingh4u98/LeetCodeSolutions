class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0, r = n-1;
        while(l<r){
            int mid = (l+r)/2;
            if(nums[mid]>nums[r])
                l = mid+1;
            else if(nums[mid]<nums[r])
                r = mid;
        }
        return nums[l];
    }
}