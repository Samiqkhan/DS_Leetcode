class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for(char a : s.toCharArray())
        {
            if(a == '[')
            {
                stack.push(']');
            }
            else if(a == '{')
            {
                stack.push('}');
            }
            else if(a == '(')
            {
                stack.push(')');
            }
            else if(stack.isEmpty() || stack.pop() != a)
            {
                return false;
            }
        }
        return stack.isEmpty();
    }
}