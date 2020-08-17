class MyHashSet {
    List<Integer> lst;
    
    /** Initialize your data structure here. */
    public MyHashSet() {
        lst = new ArrayList<Integer>();
    }
    
    public void add(int key) {
        if(lst.contains(key))
            lst.remove(new Integer(key));
        
        lst.add(new Integer(key));
    }
    
    public void remove(int key) {
        lst.remove(new Integer(key));
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(lst.contains(key))
            return true;
        else
            return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */