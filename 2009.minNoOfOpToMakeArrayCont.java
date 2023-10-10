class Solution {
    public int minOperations(int[] nums) {
       int n = nums.length;
       int ans = n;
       int[] newNums = Arrays.stream(nums)
                            .distinct()
                            .sorted()
                            .toArray();
        for(int i=0; i<newNums.length; i++){
            int left = newNums[i];
            int right = left + n - 1;
            int j = binarySearch(newNums, right);
            int count = j - i;
            ans = Math.min(ans, n - count);
        }
        return ans;
    }

    public int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length;
        while(left < right){
            int mid = (left + right)/2;
            if(target < arr[mid])
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
}