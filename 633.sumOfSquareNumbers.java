class Solution {
    public boolean judgeSquareSum(int c) {
        long l = 0, r = (int) Math.sqrt(c);
        while(l<=r){
            long prod = l*l + r*r;
            if(prod == c)
                return true;
            else if(prod < c)
                l++;
            else
                r--;
        }
        return false;
    }
}