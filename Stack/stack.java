import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);  // [10, 20, 30]

        // Peek
        System.out.println("Top element: " + stack.peek()); // 30

        // Pop
        stack.pop();
        System.out.println("After pop: " + stack); // [10, 20]

        // Check empty
        System.out.println("Is empty? " + stack.isEmpty()); // false

        // Search element
        System.out.println("Position of 10: " + stack.search(10)); // 2
    }
}
