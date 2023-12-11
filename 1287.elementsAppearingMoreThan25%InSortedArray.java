class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int ans = arr[0];
        for(int i=0; i<n-n/4; i++){
            if(arr[i] == arr[i+n/4])
                {ans = arr[i]; break;}
        }
        return ans;
    }
}