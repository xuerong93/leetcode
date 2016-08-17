public class RandomizedSet {
    ArrayList<Integer> data = new ArrayList<Integer>();
    HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
    /** Initialize your data structure here. */
    public RandomizedSet() {
        
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        } 
        else{
            data.add(val);
            map.put(val,data.size()-1);
            return true;
        } 
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(map.containsKey(val)){
            //remove value from arraylist
            data.remove(map.get(val));
            //save the index of val
            int index=map.get(val);
            //save the value of the last element of arraylist
            int value = data.get(data.size()-1);
            data.remove(data.size()-1);
            data.add(index,value);
            map.remove(value);
            //remove val from hashmap
            map.remove(val);
            //update the value of the last element inthe arraylist
            map.put(value,index);
            
            return true;
        } 
        else return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int i= (int) Math.random() % data.size();
        return data.get(i);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */