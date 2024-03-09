class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int i1 = 0, i2 = 0;
        int min = -1;
        while(i1 < len1 && i2 < len2){
           if(nums1[i1] == nums2[i2]){
               return min = nums1[i1];
           }
           else if(nums1[i1] > nums2[i2]){
               i2++;
           }
           else if(nums1[i1] < nums2[i2]){
               i1++;
           } 
        }
        return min;
    }
}