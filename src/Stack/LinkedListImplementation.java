package Stack;

public class LinkedListImplementation {
    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    static class LLStack{
        Node head = null;
        private int size = 0;

        void push(int x){
            Node temp = new Node(x);
            if(head==null){
                head = temp;
                size++;
                return;
            }
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack underflow");
                return -1;
            }
            int popped = head.val;
            head = head.next;
            size--;
            return popped;
        }

        void getSize(){
            System.out.println(size);
        }

        void display(){
            displayrec(head);
        }

        void displayrec(Node h){
            if(h==null){
                return;
            }
            int x = h.val;
            displayrec(h.next);
            System.out.print(x+" ");
        }



    }

    public static void main(String[] args) {
        LLStack stack = new LLStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
    }
}
