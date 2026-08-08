package Stack;

import java.util.Stack;

class EvaluateRevPolish {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i<tokens.length; i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
                stack.push(Integer.parseInt(tokens[i]));
            }
            else{
                int a = stack.pop();
                int b = stack.pop();
                int c=0;
                if(tokens[i].equals("+")){
                    c = b+a;
                }
                if(tokens[i].equals("-")){
                    c = b-a;
                }
                if(tokens[i].equals("*")){
                    c = b*a;
                }
                if(tokens[i].equals("/")){
                    c = b/a;
                }
                stack.push(c);
            }
        }
        return stack.pop();
    }
}