class LRUCache {
    HashMap<Integer, Node> hs;
    Node start;
    Node end;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.hs = new HashMap<>();
        this.start = new Node();
        this.end = new Node();
        
        start.next = end;
        end.prev = start;
        
    }
    
    //done
    public int get(int key) {
        if(hs.containsKey(key))
        {
            removeNode(hs.get(key));
            addNode(hs.get(key));
            return hs.get(key).value;
        }
            
        return -1;
        
    }
    
    
    public void put(int key, int value) {
        
        //if it doesnt exists
        if(!hs.containsKey(key))
        {
            if(hs.size() < capacity)
            {
                Node curr = new Node();
                curr.key = key;
                curr.value = value;
                addNode(curr);
            }
            else
            {
                Node curr = new Node();
                curr.key = key;
                curr.value = value;
                hs.remove(end.prev.key);
                removeNode(end.prev);
                addNode(curr);
            }

        }
        else
        {
            Node curr = new Node();
            curr.key = key;
            curr.value = value;
            removeNode(hs.get(key));
            addNode(curr);
        }
        
    }
    
    
    ////
    public void addNode(Node curr)
    {
        Node start_next = start.next;
        start.next = curr;
        curr.prev = start;
        
        curr.next = start_next;
        start_next.prev = curr;
        
        hs.put(curr.key, curr);
    }
    
    public void removeNode(Node curr)
    {
        Node curr_prev = curr.prev;
        Node curr_next = curr.next;
        
        curr_prev.next = curr_next;
        curr_next.prev = curr_prev;
        
        // hs.remove(curr.key);
    }
    
    ///
}

public class Node
{
    int key;
    int value;
    Node prev;
    Node next;
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */