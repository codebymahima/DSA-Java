package Stack;

class StackException extends Exception{
    StackException(String message){
        super(message);
    }
}
public class CustomStack {


    protected int data[];
    private static final int DEFAULT_SIZE = 10;

    protected int ptr = -1;

    CustomStack(int size){
        this.data = new int[size];
    }

    CustomStack(){
        this(DEFAULT_SIZE);
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public boolean isFull(){
        return ptr == data.length -1;
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot peek in an empty stack");
        }
        return data[ptr];
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
        return data[ptr--];
    }

    public void push(int value) throws StackException{
        if(isFull()){
            throw new StackException("Stack Overflow");

        }
        ptr++;
        data[ptr] = value;
    }

    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

class DynamicStack extends CustomStack{

    public void push(int value) throws StackException {
        if(isFull()){
            int [] temp = new int[2* data.length];

            for(int i = 0; i< data.length; i++){
                temp[i] = data[i];
            }

            data = temp;
        }
        super.push(value);
    }
}

