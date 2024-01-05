class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> sorted = new ArrayList<>();
        for(int i : nums){
            int ind = binarySearch(sorted, i);
            if(ind == sorted.size()){ 
                sorted.add(i);
            }
            else{
                sorted.set(ind, i);
            }
        }
        return sorted.size();
    }

    public int binarySearch(List<Integer> sorted, int target){
        int left = 0, right = sorted.size();
        int result = sorted.size();
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (sorted.get(mid) < target) {
                left = mid + 1;
            } else {
                result = mid;
                right = mid;
            }
        }
        return result;
    }
}