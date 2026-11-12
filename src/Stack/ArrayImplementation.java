package Stack;
public class ArrayImplementation {
     static class Stack{
        private int []arr = new int[5];
        private int size = 0;

        void push(int num){
            if(size==arr.length){
                System.out.println("Stack Overflow");
                return;
            }
            arr[size] = num;
            size++;
        }

        int pop(){
            if(size==0){
                System.out.println("Stack Underflow");
                return -1;
            }
        int popped = arr[size];
        size--;
        return popped;
        }


        void display(){
            System.out.print("[ ");
            for(int i = 0; i<size; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println("]");
        }


        boolean isEmpty(){
            return size ==0;
        }
        boolean isFull(){
            return size == arr.length;
        }
        int getSize(){
            return size;
        }

    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.display();
        stack.push(2);
        stack.display();
        stack.pop();
        stack.display();
        stack.push(3);
        stack.display();
        stack.push(4);
        stack.display();
        stack.push(5);
        stack.push(6);
        stack.display();
        stack.push(7);
    }
}
