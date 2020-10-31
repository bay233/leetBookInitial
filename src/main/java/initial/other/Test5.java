package initial.other;

import java.util.Stack;

public class Test5 {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            if (aChar == '(' || aChar == '{' || aChar == '[') {
                stack.push(aChar);
            } else {
                if (aChar == ')') {
                    if (stack.size() > 0 && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if (aChar == '}') {
                    if (stack.size() > 0 && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    if (stack.size() > 0 && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        if (stack.size() > 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("{{}"));
    }
}
