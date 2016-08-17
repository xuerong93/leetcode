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
            int last =data.size()-1;
            map.put(val,last);
            return true;
        } 
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        } 
        else {
          int index=map.get(val);
          if(index==data.size()-1){
              map.remove(val);
              data.remove(data.size()-1);
          }else{
            data.remove(index);
            data.add(index,data.get(data.size()-1));
            data.remove(data.size()-1);
            map.remove(val);
            map.put(data.get(index),index);
          }


        return true;
        }
        
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int i= ((int) (Math.random()*data.size())) % data.size();
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