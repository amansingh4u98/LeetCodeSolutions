class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> v = new ArrayList<>(map.values());
        Collections.sort(v);
        int cnt = 0;
        for (int i = 0; i < v.size(); i++) {
            if (k > v.get(i)) {
                k -= v.get(i);
                v.set(i, 0);
            } else {
                v.set(i, v.get(i) - k);
                k = 0;
            }
            if (v.get(i) != 0) cnt++;
        }
        return cnt;
    }
}