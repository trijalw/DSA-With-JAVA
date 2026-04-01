import java.util.Stack;
public class create {
    public static void main (String[] args) {
        Stack<Integer> myStack = new Stack<>();
        // 10 to 50 values enter karane ha
        for (int i = 10;i<=50;i++) {
            myStack.push(i);
        }
        System.out.println(myStack);
        myStack.pop();
        System.out.print(" After pop" +myStack);
        System.out.println();
        System.out.println(myStack.peek());
        System.out.println(myStack.peek());
        System.out.println(myStack.peek());
        System.out.println(myStack.size());
        System.out.println(myStack.search(43)); // returns the position from top of the stack
        System.out.println(myStack.empty());
    }
}