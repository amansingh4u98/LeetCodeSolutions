class Solution {
    //Bit Manipulation solution
    public boolean isPowerOfTwo(int n) {
         return n > 0 && (n & (n - 1)) == 0;
    }

    //Binary Search solution
    public boolean isPowerOfTwo(int n) {
        int l=0,r=n;
        while(l<=r){
            int mid = l + (r-l) / 2;
            if(Math.pow(2,mid) > n) r = mid - 1;
            else if(Math.pow(2,mid) == n) return true;
            else l = mid + 1;
        }
        return false;
    }
}