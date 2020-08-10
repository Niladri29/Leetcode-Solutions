class MyHashSet {
    List<Integer> res;

    /** Initialize your data structure here. */
    public MyHashSet() {
        res = new ArrayList<>();
    }
    
    public void add(int key) {
        if(res.contains(key))
            res.remove(new Integer(key));
        res.add(key);
    }
    
    public void remove(int key) {
        res.remove(new Integer(key));
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(res.contains(key))
            return true;
        else
            return false;
    }
//-------------------------------------------------------------------



class MyHashSet {
    
    private int[] array;

    // Initialize your data structure here. 
    public MyHashSet() {
        this.array = new int[1000000];
    }
    
    public void add(int key) {
        if(this.array[key] == 0) {
            this.array[key]++;
        }
    }
    
    public void remove(int key) {
        if(this.array[key] == 1) {
            this.array[key]--;
        }
    }
    
    //Returns true if this set contains the specified element 
    public boolean contains(int key) {
        return this.array[key] == 1;
    }
}
---------------------------------------------------------------------------
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */