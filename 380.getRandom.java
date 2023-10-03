class RandomizedSet {
    Map<Integer, Integer> map;
    List<Integer> li;
    Random rn;
    public RandomizedSet() {
        this.map = new HashMap<Integer, Integer>();
        this.li = new ArrayList<Integer>();
        this.rn = new Random();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)){
           li.add(val);
           map.put(val, li.size()-1);
           return true; 
        }
        return false;
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)){
            int ind = map.remove(val);
            int lastVal = li.remove(li.size()-1);
            if(lastVal != val){
                li.set(ind, lastVal);
                map.put(lastVal, ind);
            }
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        int random = rn.nextInt(li.size());
        return li.get(random);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */