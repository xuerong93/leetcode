class Node{
    int key;
    int val;
    Node pre;
    Node next;
    public Node(int key, int value){
        this.key = key;
        this.val = val;
    }
    
}

public class LRUCache {
    //least recently used means no set or get action occurs
    //to implement in O(1) time complecity, for add/delete action, I use List Data Structure, but when we do get action,first we need to find the key, in List it needs O(n) time. so we choose to use double linked list
    int capacity;
    HashMap<Integer, Node> keyVal= new HashMap<Integer, Node>(); 
    Node head = null;
    Node tail = null;
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node res = map.get(key);
            remove(res);
            //the least recently used element is in the head of the list and the most recent one is in the end
            AddToTail(res);
            return res.val;
        }
        return -1;
    }
    public void remove(Node res){
        if(res.pre!=null){
            res.pre.next = res.next;
            res.next.pre = res.pre;
        }else{
            head = res.next;
        }
        
        if(res.next!=null){
            res.pre.next = res.next;
            res.next.pre = res.pre;
        }else{
            tail = res.pre;
        }
    }
    public void AddToTail(Node res){
        res.pre = tail;
        res.next = null;
        if(tail!=null){
            tail.next = res;
        }
        tail = res;
        
        if(head == null){
            head = tail;
        }
    }
    public void set(int key, int value) {
        if(keyVal.containsKey(key)){
            Node old = keyVal.get(key);
            remove(old);
            AddToTail(old);
        }else{
            Node newNode = new Node(key,value);
            if(keyVal.size()<capacity){
                AddToTail(newNode);
            }else{
                keyVal.remove(key);
                remove(head);
                AddToTail(newNode);
            }
            keyVal.put(key,newNode);
        }
    }
}