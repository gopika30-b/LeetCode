class RandomizedSet {
    List<Integer> lst;
    Map<Integer, Integer> map;
    Random random = new Random();
    public RandomizedSet() {
        lst = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        map.put(val, lst.size());
        lst.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int ind = map.get(val);
        if(ind != lst.size()-1){
            int lastE = lst.get(lst.size()-1);
            lst.set(ind, lastE);
            map.put(lastE, ind);
        }
        lst.remove(lst.size()-1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        int rind = random.nextInt(lst.size());
        return lst.get(rind);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */