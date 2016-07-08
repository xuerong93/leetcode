public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty() && (s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']')) return false;
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
                continue;
            }
            char cpop=stack.pop();
            if((cpop=='(' && s.charAt(i)!=')') || (cpop=='{' &&s.charAt(i)!='}') || (cpop=='[' &&s.charAt(i)!=']'))}{
                return false;
            }
        }
        return stack.isEmpty();
    }
}