import java.util.*;

public class ValidParenthesesSolution {

    public static void main(String[] args) {

        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        
    }
    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            else if(stack.isEmpty()) {
                return false;
            }
            else if(c == ')' &&  stack.peek() == '(') {
                stack.pop();
            } else if(c == '}' &&  stack.peek() == '{') {
                stack.pop();
            } else if(c == ']' &&  stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }


        return stack.isEmpty();
    }

}