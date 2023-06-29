package Codes;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TestImpl {
    public static void main(String[] args) {
        List<Integer> al  = Arrays.asList(1,2,3,4);
         int arr[] = {1,2,3,4,5};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <arr.length ; i++) {
            stack.push(arr[i]);
        }
        while (!stack.isEmpty())
        {
            System.out.print(stack.pop());
        }


        reverseStack(stack);

    }

    private static void reverseStack(Stack<Integer> stack) {


    }
}
