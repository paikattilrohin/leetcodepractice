class Solution {
    public boolean isValid(String s) {
        
        char[] carr = s.toCharArray();
        Stack stack = new Stack();
        for(int i = 0; i < carr.length ; i++){
            if(carr[i] == '(' || carr[i] == '{' || carr[i] == '['){
                stack.push(carr[i]);
            }
            else{
                // don't forget to check if stack is empty 
                if(!stack.empty() && (carr[i] == ')' && (char)stack.peek() == '(' || 
                  carr[i] == '}' && (char)stack.peek() == '{' ||
                  carr[i] == ']' && (char)stack.peek() == '[' )) {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }
}