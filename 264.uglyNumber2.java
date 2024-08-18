class Solution {
    public int nthUglyNumber(int n) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < n; i++) {
            int newNum = Math.min(arr.get(i2) * 2, Math.min(arr.get(i3) * 3, arr.get(i5) * 5));

            arr.add(newNum);
            if (newNum == arr.get(i2) * 2)
                i2++;
            if (newNum == arr.get(i3) * 3)
                i3++;
            if (newNum == arr.get(i5) * 5)
                i5++;
        }

        return arr.get(n - 1);
    }
}