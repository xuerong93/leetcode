public class RandomizedCollection {
    ArrayList<Integer> data = new ArrayList<Integer>();
    HashMap<Integer, HashSet<Integer>> map = new HashMap<Integer, HashSet<Integer>>();
    HashSet<Integer> set =new HashSet<Integer>();
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {

           data.add(val);
           HashSet<Integer> newset = (map.containsKey)?map.get(val):new HashSet<Integer>();
           newset.add(data.size()-1);
           map.put(val,newset);
           return newset.size()==1;
        

    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        //does not contain the value, cannot remove
        if(!map.containsKey(val)){return false;}
        
        //get one of the val index
        set = map.get(val);
        int rmindex= set.iterator().next();
        //remove the index from set
        set.remove(rmindex);
        if(rmindex!=data.size()-1){
            //data need to be transfered,the last element of data list
            int chdata = data.get(data.size()-1);
            //move the last element to the deleted position
            data.set(rmindex,data.size()-1);
            //cahnge the set of last element in datalist
            map.get(chdata).remove(data.size()-1);
            map.get(chdata).add(rmindex);
        }
        data.remove(data.size()-1);
        
        if(map.get(val).size()==0) map.remove(val);
        return true;
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        return data.get((int) (Math.random()*data.size())%data.size());
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */