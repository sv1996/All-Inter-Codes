package Codes;

import java.util.Stack;
import java.util.function.Function;

public class BalancedParenthesisImpl {
    public static void main(String[] args) {
        
        /*
        Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in the given expression.

Example: 

Input: exp = “[()]{}{[()()]()}” 
Output: Balanced
Explanation: all the brackets are well-formed

Input: exp = “[(])” 
Output: Not Balanced 
Explanation: 1 and 4 brackets are not balanced because 
there is a closing ‘]’ before the closing ‘(‘
        
        
         */
        String str = "()";
        boolean ans = balanecedParentheses(str);
        if (ans) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }


    }

    private static boolean balanecedParentheses(String str) {

        char ch[] = str.toCharArray();
        Stack<Character> stack = new Stack();
        for (int i = 0; i < ch.length; i++) {
            stack.push(ch[i]);

        }
        for (int i=0;i<ch.length;i++) {
            while (!stack.isEmpty()) {
                char ch1 = stack.pop();
               boolean checkPairs = balancedPairCheck(ch[i], ch1);
               if(checkPairs)
               {
                   return true;
               }
            }

        }

//            if (!stack.isEmpty()) {
//                char ch1 = stack.pop();
//                boolean checkPairs = balancedPairCheck(ch1, ch[i]);
//                if (checkPairs) {
//                    return true;
//                }




        return false;


    }

    private static boolean balancedPairCheck(char ch1, char ch2) {
        if (ch1 == '(' && ch2 == ')' || ch1 == '{' && ch2 == '}' || ch1 == '[' && ch2 == ']') {
            return true;
        }
        return false;
    }
}
