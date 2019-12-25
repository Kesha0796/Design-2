class MyHashSet {

    List<Integer> list=new ArrayList<>();
    /** Initialize your data structure here. */
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if(!list.contains(key))
            list.add(key);
    }
    
    public void remove(int key) {
        list.remove(new Integer(key));
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(list.size()>0)
        {
            if(list.contains(key))
                return true;
            else
                return false;
        }
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