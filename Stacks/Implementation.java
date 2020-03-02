package Stacks;


import java.util.Stack;

public class Implementation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("IMP: " + stack.capacity());
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 0);
        stack_search(stack, 6);
        stack_isEmpty(stack);
    }

    private static void stack_isEmpty(Stack<Integer> stack) {
        System.out.println(stack.empty());
////        stack.iterator();
        System.out.println(stack);
        System.out.println(stack.lastElement());
        System.out.println(stack.peek());
        System.out.println(stack);
////        stack_pop(stack);
//        stack.add(2,100);
//        System.out.println(stack);
//        stack.add(200);
//        System.out.println(stack);
//        System.out.println(stack.capacity());
//        stack_push(stack);
//        System.out.println(stack.capacity());
//        System.out.println(stack.size());
//        System.out.println(stack);
    }

    static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Pushing: " + i);
            stack.push(i);
        }
    }

    static void stack_pop(Stack<Integer> stack) {
        System.out.println("POP: ");
        for (int i = 0; i < 5; i++) {
            int integer = (int) stack.pop();
            System.out.println("POPPING: " + integer);
        }
    }

    static void stack_peek(Stack<Integer> stack) {
        int integer = stack.peek();
        System.out.println("Peek: " + integer);
    }

    static void stack_search(Stack<Integer> stack, int element) {
        int pos = (int) stack.search(element);

        if (pos == -1) System.out.println("Search : Element " + element + " not found in stack.");
        else System.out.println("Search: Element " + element + " found at position " + pos);
    }

}
