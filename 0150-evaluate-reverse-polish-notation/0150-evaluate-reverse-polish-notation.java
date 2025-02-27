class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String c: tokens){
            if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")){
                int num2 = stack.pop();
                int num1 = stack.pop();
                if(c.equals("+")) stack.push(num1+num2);
                else if(c.equals("-")) stack.push(num1-num2);
                else if(c.equals("*")) stack.push(num1*num2);
                else stack.push(num1/num2);
            }else stack.push(Integer.parseInt(c));
        }
        return stack.pop();
    }
}