package Collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Andrey");
        stack.push("Alexey");
        stack.push("Oleg");
        stack.push("Misha");
        stack.push("Katya");

        while (!stack.isEmpty()) {
            System.out.println(stack);
            System.out.println(stack.pop());
        }
    }
}
