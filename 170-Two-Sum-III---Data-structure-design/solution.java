public class TwoSum {
    HashMap<Integer,Integer> addNum = new HashMap<Integer,Integer>(); 
    // Add the number to an internal data structure.
	public void add(int number) {
	    if(addNum.containsKey(number)){
	        addNum.put(number,addNum.get(number)+1);
	    }else{
	        addNum.put(number,1);
	    }
	}

    // Find if there exists any pair of numbers which sum is equal to the value.
	public boolean find(int value) {
	    for(int i: addNum.ketset()){
	        int j = value - i;
	        if(addNum.contains(j)){
	            if(i == j && addNum.get(i)<2){
	                continue;
	            }
	            return true;
	        }
	    }
	    return false;
	}
}


// Your TwoSum object will be instantiated and called as such:
// TwoSum twoSum = new TwoSum();
// twoSum.add(number);
// twoSum.find(value);