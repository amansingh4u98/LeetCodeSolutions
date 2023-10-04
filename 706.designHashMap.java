class MyHashMap {
    List<Integer> hkey;
    List<Integer> hvalue;
        
    public MyHashMap() {
        hkey = new ArrayList<Integer>();
        hvalue = new ArrayList<Integer>();
    }
    
    public void put(int key, int value) {
        if(hkey.contains(key)){
            int ind = hkey.indexOf(key);
            hvalue.set(ind, value);
        }
        else{
           hkey.add(key);
           hvalue.add(value);
        }
    }
    
    public int get(int key) {
        if(!hkey.contains(key))
            return -1;
        
        int ind = hkey.indexOf(key);
        return hvalue.get(ind);
    }
    
    public void remove(int key) {
        if(hkey.contains(key)){
            int ind = hkey.indexOf(key);
            hkey.remove(ind);
            hvalue.remove(ind);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */