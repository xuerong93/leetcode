public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int length = tokens.length;
        HashSet<String> set = new HashSet<String>();
        set.add("+");
        set.add("-");
        set.add("*");
        set.add("/");
        for(int i = 0; i < length; i++){
            if(!set.contains(tokens[i])){
                stack.push(Integer.valueOf(tokens[i]));
            }
            else{
                int after = stack.pop() ;
                int before = stack.pop(); 
                int res = 0;
                switch(tokens[i]){
                    case "+": res = before + after;break;
                    case "-": res = before - after;break;
                    case "*": res = before * after;break;
                    case "/": res = before / after;break;
                    default: break;
                }
                stack.push(res);
            }
        }
        return stack.pop();
    }
}