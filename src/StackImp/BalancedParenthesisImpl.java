package StackImp;

import java.util.Stack;

public class BalancedParenthesisImpl {
    public static void main(String[] args) {

        String str = "((){})";
        boolean ans = checkParenthesis(str);
        if (ans) {
            System.out.println("Balanced");

        } else {
            System.out.println("Not Balanced");

        }


    }

    private static boolean checkParenthesis(String str) {
        if (str.length() == 0) {
            return true;
        }
        char ch[] = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
                stack.push(ch[i]);
            } else if (ch[i] == ')' || ch[i] == '}' || ch[i] == ']') {

                if (stack.isEmpty()) {
                    return false;
                } else if (!matchCharacter(stack.pop(), ch[i])) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean matchCharacter(char ch1, char ch2) {
        if (ch1 == '(' && ch2 == ')') {
            return true;
        } else if (ch1 == '{' && ch2 == '}') {
            return true;
        } else if (ch1 == '[' && ch2 == ']') {
            return true;
        } else {
            return false;
        }
    }
}
