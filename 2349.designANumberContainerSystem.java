class NumberContainers {
      private Map<Integer, TreeSet<Integer>> numToIndices;
    private Map<Integer, Integer> indexToNum;

    public NumberContainers() {
            numToIndices = new HashMap<>();
            indexToNum = new HashMap<>();
        }
    
    public void change(int index, int number) {
        if (indexToNum.containsKey(index)) {
            int old = indexToNum.get(index);
            numToIndices.get(old).remove(index);
            if (numToIndices.get(old).isEmpty()) {
                numToIndices.remove(old);
            }
        }
        indexToNum.put(index, number);
        numToIndices.computeIfAbsent(number, s -> new TreeSet<>()).add(index);
    }
    
    public int find(int number) {
        if (numToIndices.containsKey(number)) {
            return numToIndices.get(number).first();
        }
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */