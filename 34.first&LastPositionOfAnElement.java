class Solution {
    public int[] searchRange(int[] nums, int target) {
       int left = binarySearch(nums, target, true);
       int right = binarySearch(nums, target, false);

       int ans[] = {left, right};

       return ans;
    }

    public int binarySearch(int nums[], int target, boolean leftBias){
        int n = nums.length;
        int l = 0, r = n-1;
        int ind = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]<target)
                l=mid+1;
            else if(nums[mid]>target)
                r = mid-1;
            else{
                ind = mid;
                if(leftBias)
                    r = mid-1;
                else
                    l = mid+1;
            }
        }
        return ind;
    }
}