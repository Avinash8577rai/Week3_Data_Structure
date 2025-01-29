package day2.stackandqueue.stackusingrecursion;
import java.util.Stack;
public class SortStack {
    public static void sortStack(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int top = s.pop();
            sortStack(s);
            insertInSortedOrder(s, top);
        }
    }
        private static void insertInSortedOrder(Stack<Integer> s, int data) {
        if (s.isEmpty() || s.peek() <= data) {
            s.push(data);
            return;
        }

        int top = s.pop();
        insertInSortedOrder(s, data);
        s.push(top);
    }

}
