class Solution {
    public int[] dailyTemperatures(int[] tem) {
        Stack<Integer> stack = new Stack<>();

        int n = tem.length;
        int res[] = new int[n];

        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && tem[i]>=tem[stack.peek()])
            {
                stack.pop();
            }
            if(!stack.isEmpty())
            {
                res[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return res;
    }
}