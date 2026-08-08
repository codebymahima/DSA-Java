package Stack;

import java.util.Stack;

class BackSpaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> t1 = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='#'){
                if(s1.isEmpty()){
                    continue;
                }
                else{
                    s1.pop();
                }
            }
            else{
                s1.push(c);
            }
        }
        for(int i = 0; i<t.length(); i++){
            char c = t.charAt(i);
            if(c=='#'){
                if(t1.isEmpty()){
                    continue;
                }
                else{
                    t1.pop();
                }
            }
            else{
                t1.push(c);
            }
        }
        if(s1.size()!=t1.size()){
            return false;
        }
        int size = s1.size();
        for(int i = 0; i<size; i++){
            char a = s1.pop();
            char b = t1.pop();
            if(a!=b){
                return false;
            }

        }
        return true;

    }
}