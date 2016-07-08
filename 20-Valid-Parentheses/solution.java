public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty() && (s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']')) return false;
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else if((stack.peek()=='(' && s.charAt(i)==')') || (stack.peek()=='{' &&s.charAt(i)=='}') || (stack.peek()=='[' &&s.charAt(i)==']')){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}