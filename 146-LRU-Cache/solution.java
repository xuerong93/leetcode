
//create a node which implement a double linked list
class Node{
    int key;
    int value;
    Node next;
    Node prev;
    
    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}

public class LRUCache {
    //use hashmap to store the existing node and use the double linked list to store the squence; 
    int capacity;
    Node head = null;
    Node tail = null;
    HashMap<Integer,Node> map = new HashMap<Integer, Node>();
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node old = map.get(key);
            deleteNode(old);
            addTail(old);
            return map.get(key).value;
        }
        return -1;
    }
    public void deleteNode(Node n){
        if(n.prev != null){
            n.prev.next = n.next;
        }else{
            head = n.next;
        }
        
        if(n.next!=null){
            n.next.prev = n.prev;
        }else{
            tail = n.prev;
        }
        
    }
    public void addTail(Node n){
        n.prev = tail;
        n.next = null;
        
        if(tail != null){
            tail.next = n;
        }
        tail = n;
        if(head == null){
            head = tail;
        }
    }
    public void set(int key, int value) {
        Node newNode = new Node(key,value);
        if(map.containsKey(key)){
            Node old = map.get(key);
            deleteNode(old);
            addTail(newNode);
        }else{
            if(map.size()<capacity){
                addTail(newNode);
            }else{
                map.remove(head.key);
                deleteNode(head);
                
                addTail(newNode);
            }
        }
        map.put(key,newNode);
    }
}