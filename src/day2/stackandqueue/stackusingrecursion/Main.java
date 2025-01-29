package day2.stackandqueue.stackusingrecursion;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(10);
        s.push(50);
        s.push(20);
        s.push(40);

        System.out.println("Original Stack: " + s);
        SortStack.sortStack(s);
        System.out.println("Sorted Stack: " + s);
}
}
