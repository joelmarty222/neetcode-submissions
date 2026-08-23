class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> sStack = new Stack();

        // if (s.length() <= 1){return false;}

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                sStack.push(s.charAt(i));
            }
            if (s.charAt(i) == '}'){
                if (sStack.isEmpty() || sStack.peek() != '{' ){
                    return false;
                }
                sStack.pop();
            }
            if (s.charAt(i) == ']'){
                if (sStack.isEmpty() || sStack.peek() != '[' ){
                    return false;
                }
                sStack.pop();
            }
            if (s.charAt(i) == ')'){
                if (sStack.isEmpty() || sStack.peek() != '('){
                    return false;
                }
                sStack.pop();
            }
        }
        return sStack.isEmpty();
    }
}