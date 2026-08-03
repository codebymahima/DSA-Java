package Queue;

class QueueUsingStacks {

    static int [] first;
    static int [] second;
    int ptr1 = -1;
    int ptr2 = -1;
    public QueueUsingStacks() {
        first = new int[100];
        second = new int[100];
    }
    
    public void push(int x) {
        first[++ptr1] = x;
    }
    
    public int pop() {
        if(ptr1 == -1){
            return -1;
        }
        while(ptr1!=-1){
            int removed = first[ptr1];
            second[++ptr2] = removed;
            ptr1--;
        }
        int popped = second[ptr2--];
        while(ptr2!=-1){
            int removed = second[ptr2];
            first[++ptr1] = removed;
            ptr2--;
        }
        return popped;

    }
    
    public int peek() {
        if(ptr1 == -1){
            return -1;
        }
        while(ptr1!=-1){
            int removed = first[ptr1];
            second[++ptr2] = removed;
            ptr1--;
        }
        int peeked = second[ptr2];
        while(ptr2!=-1){
            int removed = second[ptr2];
            first[++ptr1] = removed;
            ptr2--;
        }
        return peeked;
    }
    
    public boolean empty() {
        return ptr1 == -1;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */