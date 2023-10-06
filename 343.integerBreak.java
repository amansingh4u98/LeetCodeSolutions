class Solution {
    public int integerBreak(int n) {
       if (n == 2 || n == 3) return (n-1);

        // Keep removing parts of size 3 while n is greater than 4
        int res = 1;
        while (n > 4)
        {
        n -= 3;
        res *= 3; // Keep multiplying 3 to res
        }
        return (n * res); 
    }
}